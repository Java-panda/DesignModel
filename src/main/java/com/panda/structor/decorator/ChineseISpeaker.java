package com.panda.structor.decorator;

public class ChineseISpeaker extends AbstractISpeaker {
    public ChineseISpeaker(ISpeaker ISpeaker) {
        super(ISpeaker);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("说中文...");
    }
}
