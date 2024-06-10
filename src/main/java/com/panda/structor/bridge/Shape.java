package com.panda.structor.bridge;

abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public final void showInfo(){
        applyShape();
        color.applyColor();
    }
    abstract void applyShape();
}
