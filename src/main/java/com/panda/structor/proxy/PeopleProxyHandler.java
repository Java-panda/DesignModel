package com.panda.structor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PeopleProxyHandler implements InvocationHandler {
    private People people;

    public PeopleProxyHandler(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("经纪人接戏");
        Object invoke = method.invoke(people, args);
        System.out.println("经纪人收尾");
        return invoke;
    }

}
