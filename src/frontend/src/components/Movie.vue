<template>
    <div>
        <div class="top">
            <img class="google" src="https://www.google.co.kr/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" title="Google">
            <input class="search" v-model="searchWord" type="text" style=" background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;" title="검색">
        </div>
        <h3>총게시글수 : {{pager.rowCount}}</h3>
        <a @click="myAlert('aaa')">테스트</a>
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
    import {proxy} from './mixins/proxy'
    export default {
        mixins : [proxy],
        created() {
            console.log(`페이지 가기 전: `)
            let json = proxy.methods.paging(`${this.$store.state.search.context}/movie/null/0`)
            this.$store.state.search.list = json.movies
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp
            console.log(`페이지 다녀온 다음: ${json.temp.pageSize}`)
        },
        computed : {
            ...mapState({
                list : state => state.search.list,
                pages : state => state.search.pages,
                pager : state => state.search.pager,
                searchWord : state => state.search.searchWord
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