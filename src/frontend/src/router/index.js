import Vue from 'vue'
import Router from 'vue-router'
import Home from "../components/Home";
import Retriever from "../components/Retriever";
import Movie from "../components/Movie";
import Music from "../components/Music";
import Soccer from "../components/Soccer";
import MovieDetailDetail from "../components/MovieDetail";
import OWPlayer from "../components/OWPlayer";
import OWTeam from "../components/OWTeam";
import Lol from "../components/Lol";
import Detail from "../components/Detail";

Vue.use(Router)

export default new Router({
    mode:'history',
    routes:[
        {path:'/',component:Home},
        {path:'/movie',component:Movie},
        {path:'/music',component:Music},
        {path:'/soccer',component:Soccer},
        {path:'/retriever', component:Retriever},
        {path:'/movieDetail', component: MovieDetailDetail},
        {path:'/owplayer', component: OWPlayer},
        {path:'/owteams', component: OWTeam},
        {path:'/detail', component: Detail},
        {path:'/lol', component: Lol}
    ]
})
