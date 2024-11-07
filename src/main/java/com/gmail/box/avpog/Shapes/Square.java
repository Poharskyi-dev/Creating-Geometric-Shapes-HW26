package com.gmail.box.avpog.Shapes;

public class Square extends Rectangle {

    public Square(ShapeType shapeType, double height) {
        super(shapeType, height, height);
    }


    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public void displayInfo(){
        System.out.println(shapeType + " area is " + calculateArea());
    }
}
