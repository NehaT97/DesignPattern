package com.BridgelabZ.FactoryDesignPattern;

public class shapeFactory {

    static shapeFactory instance;

    private shapeFactory() {
    }

    public static shapeFactory getInstance() {
        if (instance == null) {
            instance = new shapeFactory();
        }
        return instance;
    }

    public Shape getShape(ShapeDescriptor shapeDescriptor) {
        switch (shapeDescriptor.shapeName) {
            case CIRCLE:
                TODO:
                return new Circle(shapeDescriptor.radius);


            case TRIANGLE:
                TODO:
                return new Triangle(shapeDescriptor.height, shapeDescriptor.width);


            case RECTANGLE:
                TODO:
                return new Rectangle(shapeDescriptor.height ,shapeDescriptor.width);


            default:
                return null;

        }
    }
}
