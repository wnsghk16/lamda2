import Vue from 'vue'
import Router from 'vue-router'
import Home from "../components/Home";
import Retriever from "../components/Retriever";
import Movie from "../components/Movie";
import Music from "../components/Music";
import Soccer from "../components/Soccer";

Vue.use(Router)

export default new Router({
    mode:'history',
    routes:[
        {path:'/',component:Home},
        {path:'/movie',component:Movie},
        {path:'/music',component:Music},
        {path:'/soccer',component:Soccer},
        {path:'/retriever', component:Retriever}
    ]
})