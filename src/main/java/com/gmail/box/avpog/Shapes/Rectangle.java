package com.gmail.box.avpog.Shapes;

public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle(ShapeType shapeType, double height, double width){
        super(shapeType);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void displayInfo() {
        System.out.println(shapeType + " area is " + calculateArea());
    }
}
