import axios from 'axios'
import router from '@/router' //절대경로

const state={
    context:'http://localhost:5000/',
    bugsmusic:[],
    count : 0,
    searchWord : ''
}

const actions={
    async search({commit},searchWord){
        state.searchWord = searchWord
        axios.post(state.context+'/bugsmusic',searchWord,{
                authorization: 'JWT fefege..',
                Accept : 'application/json',
                'Content-Type': 'application/json'
            })
            .then(({data})=>{
                commit('SEARCH',data)
                router.push('/retriever')
            })
            .catch(()=>{
                alert('통신 실패')
            })
    }
}

const mutations={
    SEARCH(state,data){
        state.bugsmusic = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.bugsmusic.push({
                seq : item.seq,
                artists : item.artists,
                title : item.title,
                thumbnail : item.thumbnail})}
        )
    }
}

const getters={
    bugsmusic : state => state.bugsmusic,
    count : state => state.count,
    searchWord : state => state.searchWord
}

export default {
    name:'crawling',
    namespaced:true,
    state,
    actions,
    mutations,
    getters
}
