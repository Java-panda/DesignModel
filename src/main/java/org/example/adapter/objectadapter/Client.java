package org.example.adapter.objectadapter;

import org.example.adapter.objectadapter.Adaptee;
import org.example.adapter.objectadapter.AdapterImpl;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new AdapterImpl(new Adaptee());
        adapter.afterAdapter();
    }
}
