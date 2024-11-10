package com.gmail.box.avpog.Shapes;

public abstract class Shape {
    ShapeType shapeType;

    //
    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    //
    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println(shapeType + " area is " + calculateArea());
        System.out.println("and perimeter is " + calculatePerimeter());
    }

}
