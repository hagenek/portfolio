(ns portfolio.components.project
  (:require [portfolio.state :as state]))

(defn projects
  []
  [:main
   [:div.gigs
    (for [{:keys [id img link title desc technologies]} (vals @state/projects)]
      [:div.project {:key id}
       [:a {:href link}
        [:img.gig__artwork {:src img :alt title}]]
       [[:p.project__desc desc]
        [:p technologies]]])]])