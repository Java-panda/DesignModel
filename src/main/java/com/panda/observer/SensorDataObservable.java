package com.panda.observer;

import java.util.Observable;
import java.util.Observer;

public class SensorDataObservable extends Observable {
    private float[] data;
    public SensorDataObservable() {
        data=new float[2];
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }


    @Override
    public void notifyObservers(Object arg) {
        float[] floats = (float[]) arg;
        System.arraycopy(floats, 0, data, 0, data.length);
        super.notifyObservers(data);
    }

    @Override
    public synchronized void deleteObservers() {
        super.deleteObservers();
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    protected synchronized void clearChanged() {
        super.clearChanged();
    }

    @Override
    public synchronized boolean hasChanged() {
        return super.hasChanged();
    }

    @Override
    public synchronized int countObservers() {
        return super.countObservers();
    }
}
