import axios from 'axios'
import router from '@/router' //절대경로

const state={
    context:'http://localhost:5000/',
    bugsmusic:[],
    navermovie:[],
    owplayers:[],
    owteams:[],
    lol : [],
    count : 0,
    searchWord : ''
}

const actions={
    async search({commit},searchWord){
        state.searchWord = searchWord
        switch (searchWord) {
            case '네이버영화':
                alert(`>>> ${searchWord}`)
                axios.get(state.context+`navermovie/${searchWord}`)
                    .then(({data})=>{
                        commit('MOVIE_SEARCH',data)
                        router.push('/retriever')
                    })
                    .catch(()=>{
                        alert('통신 실패')
                    })
                break;
            case '선수':
                alert(`>>> ${searchWord}`)
                axios.get(state.context+`owplayer/${searchWord}`)
                    .then(({data})=>{
                        commit('OWPLAYER_SEARCH',data)
                        router.push('/owplayer')
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

            case '승규':
                axios.post(state.context+`lolrank`, searchWord,{
                    authorization: 'JWT fefege..',
                    Accept : 'application/json',
                    'Content-Type': 'application/json'
                })
                    .then(({data})=>{
                        commit('LOL_SEARCH',data)
                        router.push('/lol')
                    })
                    .catch(()=>{
                        alert('통신 실패')
                    })
                break;
            case '팀':
                axios.post(state.context+`owteam`, searchWord,{
                    authorization: 'JWT fefege..',
                    Accept : 'application/json',
                    'Content-Type': 'application/json'
                })
                    .then(({data})=>{
                        commit('OWTEAM_SEARCH',data)
                        router.push('/owteams')
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
        alert("owplayer 뮤테이션 진입")
        state.owplayers = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.owplayers.push({
                playerimg : item.playerimg,
                player : item.player,
                name : item.name,
                hometown : item.hometown,
                teamimg : item.teamimg,
                team : item.team,
                role : item.role})}
        )
    },
    OWTEAM_SEARCH(state,data){
        state.owteams = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.owteams.push({
                teamimg : item.teamimg,
                team : item.team})}
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
    },
    LOL_SEARCH(state,data){
        alert("롤 뮤테이션에서 결과수 : " + data.count)
        state.lol = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.lol.push({
                rank : item.rank,
                name : item.name,
                win : item.win,
                lose : item.lose,
                point : item.point})}
        )
    },
}

const getters={
    bugsmusic : state => state.bugsmusic,
    navermovie : state => state.navermovie,
    count : state => state.count,
    owplayers : state => state.owplayers,
    owteams : state => state.owteams,
    lol : state => state.lol
}

export default {
    name:'crawling',
    namespaced:true,
    state,
    actions,
    mutations,
    getters
}
