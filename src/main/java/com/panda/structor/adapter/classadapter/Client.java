package com.panda.structor.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new AdapterImpl();
        adapter.afterAdapter();
    }
}
