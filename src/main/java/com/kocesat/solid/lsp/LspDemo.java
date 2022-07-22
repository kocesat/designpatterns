package com.kocesat.solid.lsp;

import com.kocesat.solid.lsp.shape.Shape;
import com.kocesat.solid.lsp.shape.impl.Circle;
import com.kocesat.solid.lsp.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class LspDemo {
    public static void main(String[] args) {
        List<Shape> circles = new ArrayList<>();
        circles.add(new Circle());
        manipulatesListOfShapes(circles);

        Circle circle = new Circle();
        manipulateShape(circle);
    }

    public static void manipulatesListOfShapes(List<Shape> shapes) {
        shapes.add(new Square());
    }

    public static void manipulateShape(Shape shape) {
        System.out.println("A shape manipulation");
    }
}
