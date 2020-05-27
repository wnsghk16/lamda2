import axios from 'axios'
import router from '../router'

const state={
    context:'http://localhost:5000/',
    searchWord:''
}

const actions={
    async search({commit},searchWord){
        this.searchWord = searchWord
        axios.post(state.context+'/soccer',searchWord,{
            authorization: 'JWT fefege..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        })
            .then(({data})=>{
                commit('SEARCH',data)
                router.push('/')
        })
            .catch(()=>{
                alert('통신 실패')
            })
    }
}

const mutations={
    SEARCH(){
        alert('soccer mutations')
    }
}

const getters={

}

export default {
    name : 'soccer',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}