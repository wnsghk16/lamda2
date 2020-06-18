<template>
    <div id="vtable">
        <v-data-table
                :headers="headers"
                :items="tableItems"
                :search="search"
        >
            <template slot="items" slot-scope="props">
                <td>{{ props.item.playerimg }}</td>
                <td class="text-xs-right">{{ tableItems.player }}</td>
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
    export default {
        data () {
            return {
                search: '',
                headers: [
                    {
                        text: 'PlayerImg',
                        align: 'left',
                        sortable: false,
                        value: 'name'
                    },
                    { text: 'Player', value: 'Player' },
                    { text: 'Name', value: 'Name' },
                    { text: 'Hometown', value: 'Hometown' },
                    { text: 'TeamImg', value: 'TeamImg' },
                    { text: 'Team', value: 'Team' },
                    { text: 'Role', value: 'Role' }
                ],
                tableItems : []
            }
        },
        created() {
            for(var i=0;i<this.$store.state.crawling.count;i++){
                this.$store.state.crawling.owplayers.forEach(
                    item => {this.tableItems.push({
                        playerimg : item.playerimg,
                        player : item.player,
                        name : item.name,
                        hometown : item.hometown,
                        teamimg : item.teamimg,
                        team : item.team,
                        role : item.role
                    })},
                )
                // console.log(this.$store.state.crawling.owplayers)
            }

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
