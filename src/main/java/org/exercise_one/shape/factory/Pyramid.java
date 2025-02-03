package org.exercise_one.shape.factory;

public class Pyramid implements Shape{
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
    public int getShapeHeight() {
        return height;
    }

    @Override
    public String getShapeName() {
        return "pyramid";
    }

    public void setHeight(int height){
        this.height = height;
    }
}
