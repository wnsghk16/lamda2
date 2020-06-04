package com.lamda.web.proxy;

import com.lamda.web.mappers.MovieMapper;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Pager {
    @Autowired MovieMapper movieMapper;
    private int rowCount, pageCount, blockCount,
            rowStart, pageStart, prevBlock,
            rowEnd, pageEnd, nextBlock,
            pageSize, blockSize,
            pageNow, blockNow;
    private boolean existPrev, existNext;
    private String searchWord;
    public void paging(){
        rowCount = movieMapper.count();
        rowStart = pageSize * pageNow;
        rowEnd = (pageNow != (pageCount-1)) ? rowStart + (pageSize-1) : rowCount-1;
        pageCount = (rowCount % pageSize != 0) ? rowCount/pageSize+1 : rowCount/pageSize;
        //pageSize = 5;
        pageStart = blockSize * blockNow;
        pageEnd = (blockNow != (blockCount-1)) ? pageStart + (blockSize-1): pageCount-1;
        //pageNow = 5;
        blockCount = (pageCount % blockSize != 0) ? pageCount/blockSize+1: pageCount/blockSize;
        //blockSize = 5;
        prevBlock = pageStart - blockSize;
        nextBlock = pageStart + blockSize;
        blockNow = pageNow / blockSize;
        existPrev = blockNow != 0;
        existNext = (blockNow + 1) != blockCount;
        System.out.println("blockNow :: "+blockNow);
        System.out.println("existPrev :: "+existPrev);
        System.out.println("existNext :: "+existNext);
    }
}
