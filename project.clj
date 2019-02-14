(defproject achord "0.1.0-SNAPSHOT"
  :description "Get data from songs like chords and lyrics and also search all kinds of songs by name or artist."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]]
  :main ^:skip-aot achord.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
