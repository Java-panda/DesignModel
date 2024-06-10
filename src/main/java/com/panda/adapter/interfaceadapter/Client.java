package com.panda.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new AdapterImpl();
        adapter.afterAdapter();
    }
}
