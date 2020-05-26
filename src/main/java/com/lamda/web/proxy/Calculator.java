package com.lamda.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class Calculator {
    @Autowired Box<Integer> box;
    public int sum(int a, int b){
        box.put("result",a+b);
        return box.get("result");
    }
    public int sub(int a, int b){
        return 0;
    }
    public int mul(int a, int b){
        return 0;
    }
    public int div(int a, int b){
        return 0;
    }
}
