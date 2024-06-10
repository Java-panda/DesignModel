package com.panda.adapter.classadapter;

public class AdapterImpl extends Adaptee implements IAdapter{
    @Override
    public void afterAdapter() {
        beforeAdapter();
        System.out.println("被适配之前的方法执行");
    }

    @Override
    public void beforeAdapter() {
        super.beforeAdapter();
    }
}
