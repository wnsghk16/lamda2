<template>
    <div id="vtable">
        <v-data-table
                :headers="headers"
                :items="tableItems"
                :search="search"
        >
            <template slot="items" slot-scope="props">
                <td>{{ props.item.playerimg }}</td>
                <td class="text-xs-right">{{ props.player }}</td>
                <td class="text-xs-right">{{ props.item.name }}</td>
                <td class="text-xs-right">{{ props.item.hometown }}</td>
                <td class="text-xs-right">{{ props.item.teamimg }}</td>
                <td class="text-xs-right">{{ props.item.team }}</td>
                <td class="text-xs-right">{{ props.item.role }}</td>
                <v-model>{{ TableItems.player }}</v-model>
            </template>
        </v-data-table>
    </div>
</template>

<script>
    import {mapState} from "vuex";

    export default {
        data () {
            return {
                search: '',
                headers: [
                    {
                        text: 'PlayerImg',
                        align: 'left',
                        sortable: false,
                        value: 'playerimg'
                    },
                    { text: 'Player', value: 'player' },
                    { text: 'Name', value: 'name' },
                    { text: 'Hometown', value: 'hometown' },
                    { text: 'TeamImg', value: 'teamimg' },
                    { text: 'Team', value: 'team' },
                    { text: 'Role', value: 'role' }
                ],

            }
        },
        computed : {
            ...mapState({
                tableItems : (state) => state.crawling.owplayers,
            })
        },
        updated () {
            console.log('updated')
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
