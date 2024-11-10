package com.gmail.box.avpog;

import com.gmail.box.avpog.Shapes.Shape;
import com.gmail.box.avpog.Shapes.Circle;
import com.gmail.box.avpog.Shapes.Rectangle;
import com.gmail.box.avpog.Shapes.ShapeType;
import com.gmail.box.avpog.Shapes.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CircleTest {

    @Test
    void testCalculateArea() {
        Shape circle0 = new Circle(ShapeType.CIRCLE, 25);
        Circle circle = (Circle) circle0;
        double expectedArea = 3.14 * 25 * 25;
        assertEquals(expectedArea, circle.calculateArea(), 0.01, "Area calculation failed for Circle");
    }

    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle(ShapeType.CIRCLE, 25);
        double expectedPerimeter = 3.14 * 2 * 25;
        assertEquals(expectedPerimeter, circle.calculatePerimeter(), 0.01, "Perimeter calculation failed for Circle");
    }

}

class RectangleTest {
    @Test
    void testCalculateArea() {
        Rectangle rectangle0 = new Rectangle(ShapeType.RECTANGLE, 25, 15);
        Rectangle rectangle = (Rectangle) rectangle0;
        double expectedArea = 25 * 15;
        assertEquals(expectedArea, rectangle.calculateArea(), 0.01, "Area calculation failed for Circle");
    }

    @Test
    void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(ShapeType.CIRCLE, 25, 15);
        double expectedPerimeter = 2 * (25 + 15);
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), 0.01, "Perimeter calculation failed for Circle");
    }

}

class SquareTest {
    @Test
    void testCalculateArea() {
        Shape square0 = new Square(ShapeType.RECTANGLE, 25);
        Square square = (Square) square0;
        double expectedArea = 25 * 15;
        assertEquals(expectedArea, square.calculateArea(), 0.01, "Area calculation failed for Circle");
    }

    @Test
    void testCalculatePerimeter() {
        Square square = new Square(ShapeType.CIRCLE, 25);
        double expectedPerimeter = 2 * (25 + 15);
        assertEquals(expectedPerimeter, square.calculatePerimeter(), 0.01, "Perimeter calculation failed for Circle");
    }

}

