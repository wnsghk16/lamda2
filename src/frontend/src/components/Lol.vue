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
                    <th class="text-left">Rank</th>
                    <th class="text-left">Name</th>
                    <th class="text-left">Win</th>
                    <th class="text-left">Lose</th>
                    <th class="text-left">Point</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of lol" :key="item.rank">
                    <td>{{ item.rank }}</td>
                    <td>{{ item.name }}</td>
                    <td>{{ item.win }}</td>
                    <td>{{ item.lose }}</td>
                    <td>{{ item.point }}</td>
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
            alert('승규 페이지')
        },
        computed : {
            ...mapState({
                lol : (state) => state.crawling.lol,
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
    .image{
        width: 50px;
        height : 50px;
    }
    .image1{
        width: 80px;
        height : 80px;
    }
</style>
