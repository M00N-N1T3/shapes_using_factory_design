package org.exercise_one.shape.factory;

public class Shapes {

    public Shapes(){

    }

    public Shape getInstanceOf(String shapeName){
        return switch (shapeName.toLowerCase()) {
            case "triangle" -> new Triangle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            case "pyramid" -> new Pyramid();
            default -> new Circle();
        };
    }

}
