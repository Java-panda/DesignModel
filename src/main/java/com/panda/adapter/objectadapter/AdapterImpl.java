package com.panda.adapter.objectadapter;

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
