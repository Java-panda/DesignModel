package org.example.adapter.interfaceadapter;

public class AdapterImpl implements IAdapter,IAdaptee {



    @Override
    public void afterAdapter() {
        beforeAdapter();
        System.out.println("被适配之后的方法执行");
    }

    @Override
    public void beforeAdapter() {
        System.out.println("被适配之前的方法执行");
    }
}
