(ns portfolio.state
  (:require [reagent.core :as r]))

(def projects (r/atom {:pro-01 {:id :pro-01
                                :title "Polka Meet"
                                :link "polkae.herokuapp.com"
                                :desc "Sweet meringue-based rhythms with smooth and sweet injections of soul"
                                :img ""
                                :technologies "MongoDb, Express,React, Node JS"}
                       :pro-02 {:id :pro-02
                                :title "Polka Meet"
                                :link "polkae.herokuapp.com"
                                :desc "Sweet meringue-based rhythms with smooth and sweet injections of soul"
                                :img ""
                                :technologies "MongoDb, Express,React, Node JS"}
                       :pro-03 {:id :pro-03
                                :title "Polka Meet"
                                :link "polkae.herokuapp.com"
                                :desc "Sweet meringue-based rhythms with smooth and sweet injections of soul"
                                :img ""
                                :technologies "MongoDb, Express,React, Node JS"}
                       :pro-04 {:id :pro-04
                                :title "Polka Meet"
                                :link "polkae.herokuapp.com"
                                :desc "Sweet meringue-based rhythms with smooth and sweet injections of soul"
                                :img ""
                                :technologies "MongoDb, Express,React, Node JS"}
                       :pro-05 {:id :pro-05
                                :title "Polka Meet"
                                :link "polkae.herokuapp.com"
                                :desc "Sweet meringue-based rhythms with smooth and sweet injections of soul"
                                :img ""
                                :technologies "MongoDb, Express,React, Node JS"}}))
