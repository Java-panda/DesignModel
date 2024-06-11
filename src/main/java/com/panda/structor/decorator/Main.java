package com.panda.structor.decorator;

public class Main {
    public static void main(String[] args) {
        ISpeaker ISpeaker = new ChineseISpeaker(new LocalISpeaker());
        ISpeaker = new EnglishISpeaker(ISpeaker);
        ISpeaker.speak();
    }
}
