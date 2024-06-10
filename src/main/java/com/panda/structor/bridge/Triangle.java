package com.panda.structor.bridge;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    void applyShape() {
        System.out.println("三角形");
    }
}
