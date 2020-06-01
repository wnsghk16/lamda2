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
    private int rowCount, rowStart, rowEnd,
                pageCount, pageSize, pageStart, pageEnd, pageNow,
                blockCount, blockSize, prevBlock, nextBlock, blockNow;
    public void paging(){
        rowCount = movieMapper.count();
        rowStart = pageSize * pageNow;
        rowEnd = (pageNow != (pageCount-1)) ? rowStart + (pageSize-1) : rowCount-1;
        pageCount = (rowCount % pageSize != 0) ? rowCount/pageSize+1 : rowCount/pageSize;
        //pageSize = 5;
        pageStart = blockSize * blockNow;
        pageEnd = (blockNow != (blockCount-1)) ? pageStart + (blockSize-1): pageCount-1;
        //pageNow = 0;
        blockCount = (pageCount % blockSize != 0) ? pageCount/blockSize+1: pageCount/blockSize;
        //blockSize = 5;
        prevBlock = pageStart - blockSize;
        nextBlock = pageStart + blockSize;
        blockNow = pageNow / blockSize;
    }
}
