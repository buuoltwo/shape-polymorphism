package com.github.hcsp.polymorphism;

public class Square extends Rectangle{
    // 正方形的边长
    private double sideLength;

    public Square(double sideLength) {
        super(sideLength,sideLength);
        this.sideLength = sideLength;
    }
}
