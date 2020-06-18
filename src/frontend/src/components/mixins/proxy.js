import axios from "axios"

export const proxy={
    methods:{
        tester(d){
            alert(d)
        },
        paging(d) {
            const movies = []
            const pages = []
            let temp = {}
            axios
                .get(d)
                .then(({data})=>{
                    data.list.forEach(elem => {movies.push(elem)})
                    let pager = data.pager
                    let i = pager.pageStart
                    console.log(`페이지 메소드 내부: ${pager.pageEnd}`)
                    for(; i <= pager.pageEnd;i++){
                        pages.push(i+1)
                    }
                    temp.rowCount = pager.rowCount
                    temp.existPrev = pager.existPrev
                    temp.existNext = pager.existNext
                    temp.searchWord = pager.searchWord
                    temp.nextBlock = pager.nextBlock
                    temp.prevBlock = pager.prevBlock
                })
                .catch(err=>{
                    alert(`영화 통신 실패 ${err}`)
                })
            return {movies, pages, temp}
        },
    }
}
