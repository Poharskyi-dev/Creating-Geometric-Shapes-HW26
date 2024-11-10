package com.gmail.box.avpog.Shapes;

public class Circle extends Shape {
    double radius;

    public Circle(ShapeType shapeType, double radius) {
        super(shapeType);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter(){
        return 3.14 * 2 * radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
