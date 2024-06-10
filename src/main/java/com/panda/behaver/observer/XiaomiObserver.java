package com.panda.behaver.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class XiaomiObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("小米：" + Arrays.toString((float[]) arg));
    }
}
