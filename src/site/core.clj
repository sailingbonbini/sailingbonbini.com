(ns site.core
  (:require [hiccup.page :as hp]))

(declare header)
(declare footer)
(declare homepage)

(defn page [data]
  (hp/html5
   (header "This is my new title!")
   (homepage data)
   (footer "Sailing Bon Bini.")))

(defn homepage [data]
  [:body {:class "homepage"}
   [:div {:id "page-wrapper"}
    [:div {:id "header"}
     [:div {:class "inner"}
      [:header
       [:h1 [:a {:id "logo" :href "index.html"} "Sailing Bon Bini"]]
       [:hr]
       [:p "To reach a port, we must set sail"]]
      [:footer
       [:a {:class "button circled scrolly" :href "#banner"} "Start"]]]
     [:nav {:id "nav"}
      [:ul
       [:li [:a {:href "index.html"} "Home"]]
       [:li
        [:a {:href "#"} "Posts"]
        [:ul
         [:li
          [:a {:href "#"} "First post"]]
         [:li
          [:a {:href "#"} "Second post"]]
         [:li
          [:a {:href "#"} "Third post"]]
         [:li
          [:a {:href "#"} "About"]]
         [:li
          [:a {:href "#"} "The Boat"]]
         [:li
          [:a {:href "#"} "Get in touch!"]]]]]]]
    [:section {:id "banner"}
     [:header
      [:h2 "Hi. We are glad that you are here. " [:strong "Sailing Bon Bini"] "."]]]
    [:section {:class "carousel"}
     [:div {:class "reel"}
      [:article
       [:a {:class "image featured" :href "#"}
        [:img {:alt "", :src "images/pic01.jpg"}]]
       [:header [:h3 [:a {:href "#"} "First article."]]]
       [:p
        "This is a short description of the first article."]]]]]])


(defn header [title]
  [:head
   [:title title]
   [:meta {:charset "utf-8"}]
   [:meta {:content "width=device-width, initial-scale=1", :name "viewport"}]
   "<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->"
   [:link {:href "assets/css/main.css", :rel "stylesheet"}]
   "<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->"])

(defn footer
  [copyright]
  [:div.copyright
    [:ul.menu
     [:li "© " copyright " All rights reserved."]
    [:li
     "Design: "
     [:a {:href "http://html5up.net"} "HTML5 UP"]]]
   [:script {:src "assets/js/jquery.min.js"}]
   [:script {:src "assets/js/jquery.dropotron.min.js"}]
   [:script {:src "assets/js/jquery.scrolly.min.js"}]
   [:script {:src "assets/js/jquery.onvisible.min.js"}]
   [:script {:src "assets/js/skel.min.js"}]
   [:script {:src "assets/js/util.js"}]
   "<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->"
   [:script {:src "assets/js/main.js"}]])

