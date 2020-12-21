package com.BridgelabZ.FactoryDesignPattern;

public class ShapeDescriptor {

    public ShapeType shapeName;
    int radius;
    int width;
    int height;

    enum ShapeType {CIRCLE, TRIANGLE, RECTANGLE}

}
