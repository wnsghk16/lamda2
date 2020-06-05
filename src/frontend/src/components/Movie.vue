<template>
    <div>
        <div class="top">
            <div >
                <table height="50">
                    <tr>
                        <td>
                            <router-link to = "/"><img class="logo" src="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png" height="30" width="92"></router-link>
                        </td>
                        <td>
                            <input @keyup.enter="search" id="searchWord" type="text" style="background-repeat: no-repeat;" title="검색">
                        </td>
                        <td>
                            <button @click="retrieve" id="search_btn" type="submit" tabindex="3" class="btn_submit">
                                <img src="https://images-na.ssl-images-amazon.com/images/I/41HeL2cy9LL.png" height="30" width="30">
                                <span class="ico_search_submit"></span>
                            </button>
                        </td>
                        <td width="999" style="text-align: right; float: right">
                            <a>Gmail</a>
                            <a>이미지</a>
                            <input id="login" type="button" value="로그인">
                        </td>
                    </tr>
                </table>
            </div>
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
                    <td @click="retrieveOne(item.seq)"><a href="#">{{ item.title }}</a></td>
                    <td>{{ item.rankDate }}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center">
            <span @click="transferPage(pager.prevBlock)" v-if ='pager.existPrev' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">이전</span>
            <span @click="transferPage(i-1)" v-for='i of pages' :key="i" style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">{{i}}</span>
            <span @click="transferPage(pager.nextBlock)" v-if ='pager.existNext' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">다음</span>
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
            let json = proxy.methods.paging(`${this.$store.state.search.context}/movie/null/0`/*+this.$store.state.search.pager.nextBlock*/)
            this.$store.state.search.list = json.movies
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp
            console.log(`페이지 다녀온 다음: ${json.temp.pageSize}`)
        },
        computed : {
            ...mapState({
                list : state => state.search.list,
                pages : state => state.search.pages,
                pager : state => state.search.pager
            })
        },
        methods:{
            transferPage(i){
                this.$store.dispatch('search/transferPage',{cate:'movie',searchWord:'null',pageNumber:i})
            },
            retrieve(){
                let searchWord = document.getElementById('searchWord').value
                if(searchWord === '')  searchWord = 'null'
                this.$store.dispatch('search/transferPage',{cate:'movie',searchWord:searchWord,pageNumber:0})
            },
            retrieveOne(movieSeq){
                this.$store.dispatch('search/retrieveOne',{cate:'movie',searchWord:movieSeq})
            },
            search(){
                this.$store.dispatch('search/find', {category : 'movies/list', searchWord : document.getElementById('search').value})
            }
        }
    }

</script>

<style scoped>
    .top  {
        margin-top:28px;
        margin-bottom:28px;
    }
    .logo {
        vertical-align: middle;
        margin-left:24px;
        margin-right:24px;
    }
    #searchWord{
        display: block;
        width: 550px;
        height: 50px;
        font-size: 15pt;
        border: 1px solid #EAEAEA;
    }
    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }
    button{
        font-size: 12px;
        line-height: 16px;
        color: #000;
    }
    button{
        margin: 0;
        padding: 0;
    }
    button {
        -webkit-appearance: button;
        -webkit-writing-mode: horizontal-tb !important;
        text-rendering: auto;
        letter-spacing: normal;
        word-spacing: normal;
        text-transform: none;
        display: inline-block;
        text-align: center;
        align-items: flex-start;
        cursor: default;
        background-color: buttonface;
        box-sizing: border-box;
        margin: 0em;
        font: 400 13.3333px Arial;
        padding: 1px 6px;
        border : 1px solid #EAEAEA;
    }
    a{
        text-decoration: none;
        font-size: 10.5pt;
        margin: 0px 10px;
        color: grey;
    }
    a:hover{
        text-decoration: underline;
    }
    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }
    #login{
        background-color: #4485F3;
        color: #FFFFFF;
        width: 70px;
        height: 30px;
        border: none;
        vertical-align: middle;
        margin: 10px 12px 10px 7px;
        font-weight: bold;
        font-size: 10pt;
        border-radius: 2px;
    }
</style>