package com.panda.structor.decorator;

abstract class AbstractISpeaker implements ISpeaker {
    private ISpeaker innerISpeaker;

    public AbstractISpeaker(ISpeaker ISpeaker) {
        this.innerISpeaker = ISpeaker;
    }

    @Override
    public void speak() {
        innerISpeaker.speak();
    }
}
