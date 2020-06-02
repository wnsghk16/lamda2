<template>
    <div>
        <div class="top">
            <img class="google" src="https://www.google.co.kr/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" title="Google">
            <input class="search" v-model="searchWord" type="text" style=" background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;" title="검색">
        </div>
        <h3>검색결과 : {{count}}</h3>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">No</th>
                    <th class="text-left">Thumbnail</th>
                    <th class="text-left">Artist</th>
                    <th class="text-left">Title</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of bugsmusic" :key="item.seq">
                    <td>{{ item.seq }}</td>
                    <td><img :src="item.thumbnail"></td>
                    <td>{{ item.artists }}</td>
                    <td>{{ item.title }}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center">
            <v-pagination
                    v-model="page"
                    :length="15"
                    :total-visible="7"
            ></v-pagination>
        </div>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    export default {
        data () {
            return {
                page : 1
            }
        },
        created() {
            alert('음악 페이지')
        },
        computed : {
            ...mapState({
                bugsmusic : (state) => state.crawling.bugsmusic,
                count : (state) => state.crawling.count,
                searchWord : (state) => state.crawling.searchWord
            })
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