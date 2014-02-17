(ns domkm.whois
  (:require [zweikopf.multi :as rb :refer [call-ruby clojurize Clojurize ruby-eval]])
  (:import [org.jruby.embed ScriptingContainer LocalContextScope]
           [org.jruby RubyStruct]))

(extend-protocol Clojurize
  RubyStruct
  (clojurize [this ruby]
    (persistent!
      (reduce (fn [acc key]
                (assoc! acc
                        (clojurize key ruby)
                        (clojurize (call-ruby ruby this "[]" key) ruby)))
              (transient {})
              (.members this)))))

(def ^:private ruby (ScriptingContainer. LocalContextScope/THREADSAFE))

;; TODO: set compile mode?
;; ScriptingContainer container = new ScriptingContainer()
;; container.getProvider().getRubyInstanceConfig().setCompileMode(CompileMode.JIT)

(ruby-eval ruby "ENV['GEM_PATH']='gems'; ENV['GEM_HOME']='gems'; require 'whois'")

(def ^:private whois-gem (ruby-eval ruby "Whois"))

(defn whois [^String q]
  (let [record (call-ruby ruby whois-gem q)]
    {:parts (clojurize (call-ruby ruby record :parts) ruby)
     :properties (clojurize (call-ruby ruby record :properties) ruby)}))
