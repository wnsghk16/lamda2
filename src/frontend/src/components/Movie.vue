<template>
    <div>
        <div class="top">
            <img class="google" src="https://www.google.co.kr/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" title="Google">
            <input class="search" v-model="searchWord" type="text" style=" background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;" title="검색">
        </div>
        <h3>총게시글수 : {{pager.rowCount}}</h3>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">순위</th>
                    <th class="text-left">영화제목</th>
                    <th class="text-left">집계날짜</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of list" :key="item.seq">
                    <td>{{ item.seq }}</td>
                    <td>{{ item.title }}</td>
                    <td>{{ item.rankDate }}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center">
            <span v-if ='pager.existPrev' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">이전</span>
            <span @click="transferPage(i)" v-for='i of pages' :key="i" style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">{{i}}</span>
            <span v-if ='pager.existNext' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">다음</span>
        </div>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    import axios from 'axios'
    export default {
        data () {
            return {
                page : 0,
                pages: [],
                list:[],
                pager: {},
                totalCount: ''
            }
        },
        created() {
            axios
            .get(`${this.$store.state.search.context}/movie/${this.$store.state.search.searchWord}/${this.$store.state.search.pageNumber}`)
            .then(({data})=>{
                data.list.forEach(elem=>{this.list.push(elem)})
                this.pager = data.pager
                let i =this.pager.pageStart+1
                const arr = []
                for(;i<=this.pager.pageEnd+1;i++){
                    arr.push(i)
                }
                this.pages = arr
            })
            .catch(err=>{
                alert(`영화 통신 실패 ${err}`)
            })
        },
        computed : {
            ...mapState({
                searchWord : state => state.search.searchWord,
                list : state => state.search.movies
            })
        },
        methods:{
            transferPage(i){
                alert(`이동페이지 ${i-1}`)
                this.$store.dispatch('search/transferPage',{cate:'movie',searchWord:'null',pageNumber:i-1})
            }
        }
    }
</script>

<style scoped>
    .google{
        width: 140px;
        height: 45px;
        margin-right: 20px;
    }
    .search{
        width: 550px;
        height: 40px;
        font-size: 15pt;
        box-shadow: 3px 3px 5px #C3C3C3;
        border: 1px solid #EAEAEA;
    }
    .top{
        text-align: center;
        margin: 10px;
     }
</style>