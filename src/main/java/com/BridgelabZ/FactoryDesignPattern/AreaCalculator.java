package com.BridgelabZ.FactoryDesignPattern;

public class AreaCalculator {
    static AreaCalculator instance;

    /* Singeleton Design Pattern */
    private AreaCalculator() {
    }

    public static AreaCalculator getInstance() {
        if (instance == null) {
            instance = new AreaCalculator();
        }
        return instance;
    }

    public float findArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return (float) (Math.PI * circle.radius * circle.radius);
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            return (float) (0.5 * (triangle.width * triangle.height));
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.height * rectangle.width;
        } else {
            return 0.0f;
        }
    }
}

