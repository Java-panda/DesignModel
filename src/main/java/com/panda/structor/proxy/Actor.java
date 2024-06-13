package com.panda.structor.proxy;

public class Actor implements People{
    @Override
    public Object doWhat() {
        System.out.println("演戏");
        return "片酬";
    }
}
