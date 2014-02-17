(defproject com.domkm/whois "0.0.1-SNAPSHOT"
  :description "A Clojure wrapper for the Ruby WHOIS library (http://ruby-whois.org/) running on JRuby."
  :url "https://github.com/DomKM/whois.clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.jruby/jruby-complete "1.7.10"]
                 [zweikopf "1.0.0" :exclusions [org.jruby/jruby-complete]]]
  :resource-paths ["gems"])
