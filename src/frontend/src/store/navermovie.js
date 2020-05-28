import axios from 'axios'
import router from '../router'

const state={
    context:'http://localhost:5000/',
    navermovie:[],
    count : 0,
    searchWord : ''
}

const actions={
    async search({commit},searchWord){
        state.searchWord = searchWord
        axios.get(state.context+'navermovie/'+searchWord)
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
        state.navermovie = [] //초기화
        state.count = data.count
        data.list.forEach(
            item => {state.navermovie.push({
                seq : item.seq,
                title : item.title})}
        )
    }
}
const getters={
    navermovie : state => state.navermovie,
    count : state => state.count,
    searchWord : state => state.searchWord
}
export default {
    name : 'navermovie',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}