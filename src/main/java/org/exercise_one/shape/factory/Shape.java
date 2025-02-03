package org.exercise_one.shape.factory;

public interface Shape {
    int DEFAULT_HEIGHT = 6;

    void draw();

    void draw(int height);

    void drawOutline();

    void drawOutline(int height);

    String getShapeName();

    int getShapeHeight();
}
