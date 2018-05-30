(defproject duct/module.cljs "0.4.0-alpha1"
  :description "Duct module for developing and compiling ClojureScript"
  :url "https://github.com/duct-framework/module.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [binaryage/devtools "0.9.10"]
                 [duct/core "0.7.0-alpha5"]
                 [duct/compiler.cljs "0.2.0"]
                 [duct/server.figwheel "0.2.1"]
                 [integrant "0.7.0-alpha2"]])
