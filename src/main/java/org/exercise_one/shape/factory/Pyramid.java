package org.exercise_one.shape.factory;

import org.w3c.dom.ls.LSOutput;

public class Pyramid implements Shape{
    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {
        // I know the nesting in this section is going to be a mess!

        int centerPoint = height -1;

        for (int row = 0; row < height;row++){
            int startingPoint = centerPoint - row;
            int endingPoint = centerPoint + row;

            for (int column = 0; column < (height * 2) - 1; column++){

                boolean drawStar = column >= startingPoint && column <= endingPoint;
                String string = (drawStar) ? "*" : " ";
                System.out.print(string);
                if (column >= endingPoint) break;
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height) {
        setHeight(height);
        int centerPoint = height -1;

        for (int row = 0; row < height; row++){
            int startingPoint = centerPoint - row;
            int endingPoint = centerPoint + row;

            for (int column = 0; column < height * 2 -1; column++){
                boolean drawStar = column >= startingPoint && column <= endingPoint;
                String string = (drawStar) ? "*" : " ";
                System.out.print(string);
                if(column >= endingPoint) break;
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline() {
        int centerPoint = height - 1;

        for (int row = 0; row < height; row ++){
            int startingPoint = centerPoint - row;
            int endingPoint = centerPoint + row;

            for (int column = 0; column < height * 2 - 1; column++){
                boolean drawStar = column == startingPoint
                        || column == endingPoint
                        || row == height - 1;

                String string = (drawStar) ? "*" : " ";
                System.out.print(string);
                if(column >= endingPoint) break;
            }
            System.out.println();
        }

    }

    @Override
    public void drawOutline(int height) {
        setHeight(height);
        int centerPoint = height - 1;

        for (int row = 0; row < height; row++){
            int startingPoint = centerPoint - row;
            int endingPoint = centerPoint + row;

            for (int column = 0; column < height * 2 -1; column++){
                boolean drawStar = column == startingPoint
                        || column == endingPoint || row == height -1;

                String string = (drawStar) ? "*" : " ";
                System.out.print(string);
                if (column >= endingPoint) break;
            }
            System.out.println();
        }

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
