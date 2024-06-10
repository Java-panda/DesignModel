package com.panda.structor.bridge;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void applyShape() {
        System.out.println("四边形");
    }
}
