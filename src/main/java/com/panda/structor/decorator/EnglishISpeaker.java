package com.panda.structor.decorator;

public class EnglishISpeaker extends AbstractISpeaker {

    public EnglishISpeaker(ISpeaker ISpeaker) {
        super(ISpeaker);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("说英文...");
    }
}
