(ns domkm.whois
  (:require  [zweikopf.multi :as rb :refer [call-ruby clojurize Clojurize ruby-eval]])
  (:import [org.jruby.embed ScriptingContainer LocalContextScope]
           [org.jruby.RubyStruct]
           [org.jruby.runtime.Block]))

(extend-protocol Clojurize
  org.jruby.RubyStruct
  (clojurize [this ruby]
    (let [context (-> ruby .getProvider .getRuntime .getCurrentContext)
          null-block org.jruby.runtime.Block/NULL_BLOCK]
      (persistent!
        (reduce (fn [acc [key val]]
                  (assoc! acc
                          (keyword (clojurize key ruby))
                          (clojurize val ruby)))
                (transient {})
                (call-ruby ruby (.each_pair this context null-block) :to_a))))))

(def ^:private ruby (ScriptingContainer. LocalContextScope/THREADSAFE))

;; TODO: set compile mode?
;; ScriptingContainer container = new ScriptingContainer()
;; container.getProvider().getRubyInstanceConfig().setCompileMode(CompileMode.JIT)

(ruby-eval ruby "ENV['GEM_PATH']='gems';
                 ENV['GEM_HOME']='gems';
                 require 'whois'")

(def ^:private whois-gem (ruby-eval ruby "Whois"))

(defn whois [^String q]
  (let [record (call-ruby ruby whois-gem :lookup q)]
    {:parts (clojurize (call-ruby ruby record :parts) ruby)
     :properties (clojurize (call-ruby ruby record :properties) ruby)}))
