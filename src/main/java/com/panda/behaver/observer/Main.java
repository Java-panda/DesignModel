package com.panda.behaver.observer;

public class Main {
    public static void main(String[] args) {
        SensorDataObservable sensorData = new SensorDataObservable();
        HuaWeiObserver huaWeiObserver = new HuaWeiObserver();
        XiaomiObserver xiaomiObserver = new XiaomiObserver();

        sensorData.addObserver(huaWeiObserver);
        sensorData.addObserver(xiaomiObserver);

        sensorData.setChanged();
        sensorData.notifyObservers(new float[]{1f,2f});

    }
}