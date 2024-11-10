package com.gmail.box.avpog.Shapes;

public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle(ShapeType shapeType, double height, double width){
        super(shapeType);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter(){
        return 2 * (height + width);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
