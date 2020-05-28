import Vue from 'vue'
import Vuex from 'vuex'
import crawling from "./crawling"
import soccer from "./soccer"
import navermovie from "./navermovie";

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules:{
        crawling,
        soccer,
        navermovie
    }
})