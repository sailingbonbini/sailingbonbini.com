(set-env!
 :source-paths #{"src" "content"}
 :resource-paths #{"assets" "img"}
 :dependencies '[[perun "0.3.0" :scope "test"]
                 [hiccup "1.0.5" :exclusions [org.clojure/clojure]]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [pandeiro/boot-http "0.7.6"]
                 [cpmcdaniel/boot-copy "1.0"]])

(require '[io.perun :refer :all]
         '[cpmcdaniel.boot-copy :refer :all]
         '[pandeiro.boot-http :refer [serve]])

(deftask servelocal
  "Build and serve the blog"
  []
  (comp (markdown)
        (render :renderer 'site.core/page)
        (serve :resource-root "public")
        (wait)))
