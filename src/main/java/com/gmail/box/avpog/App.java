package com.gmail.box.avpog;
import com.gmail.box.avpog.Shapes.Circle;
import com.gmail.box.avpog.Shapes.Rectangle;
import com.gmail.box.avpog.Shapes.Square;


import static com.gmail.box.avpog.Shapes.ShapeType.*;

public class App
{
    public static void main(String[] args) {


        Circle circle = new Circle(CIRCLE, 25);

        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(RECTANGLE, 10, 5);

        System.out.println(rectangle.calculateArea());

        Square square = new Square(SQUARE, 5);

        System.out.println(square.calculateArea());
    }
}

