package com.panda.structor.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        People people = new Actor();
        PeopleProxyHandler proxyHandler = new PeopleProxyHandler(people);
        People proxyPeople = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), proxyHandler);
        Object doWhat = proxyPeople.doWhat();
        System.out.println(doWhat);
    }
}
