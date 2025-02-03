package org.exercise_one;

import org.exercise_one.shape.factory.Shape;
import org.exercise_one.shape.factory.Shapes;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> shapeNames = List.of("square","rectangle","pyramid","circle","triangle");
        Shapes shapes = new Shapes();

        for (String shapeName : shapeNames){
            Shape shape = shapes.getInstanceOf(shapeName);
            System.out.printf("Drawing a %s of height %s....%n", shape.getShapeName(), shape.getShapeHeight());
            shape.draw();
            System.out.println();
        }
    }
}