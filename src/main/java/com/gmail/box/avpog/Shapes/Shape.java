package com.gmail.box.avpog.Shapes;

public class Shape {
    ShapeType shapeType;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public double calculateArea() {
        return 0;
    }

    public void displayInfo(){
        System.out.println("Abstract shape with shape type " + shapeType);
    }

}
