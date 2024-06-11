package com.panda.structor.decorator;

public class LocalISpeaker implements ISpeaker {
    @Override
    public void speak() {
        System.out.println("说方言...");
    }
}
