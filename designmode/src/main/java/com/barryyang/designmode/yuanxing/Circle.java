package com.barryyang.designmode.yuanxing;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }
}
