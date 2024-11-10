package com.gmail.box.avpog.Shapes;

public class Square extends Rectangle {

    public Square(ShapeType shapeType, double height) {
        super(shapeType, height, height);
    }


    public double calculateArea() {
        return super.calculateArea();
    }

    public double calculatePerimeter(){
        return 4 * getHeight();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
    }
}
