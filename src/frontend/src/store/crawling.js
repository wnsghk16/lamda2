import axios from 'axios'
import router from '@/router' //절대경로

const state={
    context:'http://localhost:5000/',
    bugsmusic:[],
    navermovie:[],
    owplayers:[],
    count : 0,
    searchWord : ''
}

const actions={
    async search({commit},searchWord){
        state.searchWord = searchWord
        switch (searchWord) {
            case '네이버영화':
                alert(`>>> ${searchWord}`)
                axios.get(state.context+`movie/list/0/${searchWord}`)
                    .then(({data})=>{
                        commit('MOVIE_SEARCH',data)
                        router.push('/retriever')
                    })
                    .catch(()=>{
                        alert('통신 실패')
                    })
                break;
            case '벅스':
                axios.post(state.context+`bugsmusic`, searchWord,{
                    authorization: 'JWT fefege..',
                    Accept : 'application/json',
                    'Content-Type': 'application/json'
                })
                    .then(({data})=>{
                        commit('MUSIC_SEARCH',data)
                        router.push('/retriever')
                    })
                    .catch(()=>{
                        alert('통신 실패')
                    })
                break;
            case '선수':
                axios.post(state.context+`owplayer`, searchWord,{
                    authorization: 'JWT fefege..',
                    Accept : 'application/json',
                    'Content-Type': 'application/json'
                })
                    .then(({data})=>{
                        commit('OWPLAYER_SEARCH',data)
                        router.push('/owplayers')
                    })
                    .catch(()=>{
                        alert('통신 실패')
                    })
                break;
        }
    }
}

const mutations={
    MUSIC_SEARCH(state,data){
        state.bugsmusic = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.bugsmusic.push({
                seq : item.seq,
                artists : item.artists,
                title : item.title,
                thumbnail : item.thumbnail})}
        )
    },
    OWPLAYER_SEARCH(state,data){
        state.owplayers = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.owplayers.push({
                player : item.player,
                name : item.name,
                hometown : item.hometown,
                team : item.team,
                role : item.role})}
        )
    },
    MOVIE_SEARCH(state,data){
        alert("영화 뮤테이션에서 결과수 : " + data.count)
        state.navermovie = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.navermovie.push({
                seq : item.seq,
                title : item.title,
                rankDate : item.rankDate})}
        )
    }
}

const getters={
    bugsmusic : state => state.bugsmusic,
    navermovie : state => state.navermovie,
    count : state => state.count,
    searchWord : state => state.searchWord,
    owplayers : state => state.owplayers
}

export default {
    name:'crawling',
    namespaced:true,
    state,
    actions,
    mutations,
    getters
}
