<template>
    <div>
        <v-card>
            <v-card-title>
                Overwatch League Players
                <v-spacer></v-spacer>
                <v-text-field
                        v-model="search"
                        append-icon="search"
                        label="Search"
                        single-line
                        hide-details
                ></v-text-field>
            </v-card-title>
            <h3>검색결과 : {{count}}</h3>
            <owplayer-component>
            </owplayer-component>

            <v-alert slot="no-results" :value="true" color="error" icon="warning">
                Your search for "{{ search }}" found no results.
            </v-alert>
        </v-card>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    import OwplayerComponent from "./owplayer-compoent";

    export default {
        components: {OwplayerComponent},
        data () {
            return {
                search: '',
            }
        },
        computed : {
            ...mapState({
                count : (state) => state.crawling.count,
            })
        }
    }
</script>

<style scoped>
</style>
