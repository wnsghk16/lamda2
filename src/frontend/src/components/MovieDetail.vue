<template>
    <div>
        <h1>디테일 화면</h1>
        <br>
        <h3>순위 : {{ movie.seq }}</h3>
        <h3>영화이름 : {{ movie.title }}</h3>
        <h3>집계일 : {{ movie.rankDate }}</h3>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    export default {
        computed:{
            ...mapState({
                movie : state=>state.search.item
            })
        }
    }
</script>

<style scoped>

</style>