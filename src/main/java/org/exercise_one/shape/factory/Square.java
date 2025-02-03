package org.exercise_one.shape.factory;

public class Square implements Shape {

    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int colum = 0; colum < height; colum++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height) {
        this.height = height;

        for (int row = 0; row < height; row++) {
            for (int colum = 0; colum < height; colum++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline() {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < height; column++) {

                if (row == 0 || row == height - 1
                        || column == 0 || column == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline(int height) {
        this.height = height;

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < height; column++) {
                if (row == 0 || row == height - 1
                        || column == 0 || column == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public int getShapeHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

}
