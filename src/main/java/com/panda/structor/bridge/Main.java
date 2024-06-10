package com.panda.structor.bridge;

public class Main {
    public static void main(String[] args) {
        Shape triRed = new Triangle(new Red());
        triRed.showInfo();

        Shape rectBlue = new Rectangle(new Blue());
        rectBlue.showInfo();
    }
}
