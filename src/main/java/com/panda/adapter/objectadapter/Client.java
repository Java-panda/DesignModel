package com.panda.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new AdapterImpl(new Adaptee());
        adapter.afterAdapter();
    }
}
