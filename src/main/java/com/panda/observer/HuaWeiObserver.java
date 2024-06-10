package com.panda.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class HuaWeiObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("华为：" + Arrays.toString((float[]) arg));
    }
}
