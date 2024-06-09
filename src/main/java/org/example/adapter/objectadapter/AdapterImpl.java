package org.example.adapter.objectadapter;

import org.example.adapter.objectadapter.Adaptee;
import org.example.adapter.objectadapter.IAdapter;

public class AdapterImpl implements IAdapter {
    private final Adaptee adaptee;

    public AdapterImpl(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void afterAdapter() {
        adaptee.beforeAdapter();
        System.out.println("被适配之后的方法执行");
    }
}
