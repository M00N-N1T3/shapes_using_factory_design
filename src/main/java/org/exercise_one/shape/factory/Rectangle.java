package org.exercise_one.shape.factory;

public class Rectangle  implements Shape{
    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {

    }

    @Override
    public void draw(int height) {

    }

    @Override
    public void drawOutline() {

    }

    @Override
    public void drawOutline(int height) {

    }

    @Override
    public String getShapeName() {
        return "rectangle";
    }

    @Override
    public int getShapeHeight() {
        return DEFAULT_HEIGHT;
    }
}
