package org.exercise_one.shape.factory;

public class Triangle implements Shape{

    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {
        for (int row = 0; row < height; row++){

            for (int column = 0;  column < height; column ++ ){
                boolean drawStar = (row == height -1) ||
                        (height - 1 - row) <= column;

                if (drawStar){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height) {
        setHeight(height);

        for (int row = 0; row < height; row++){

            for(int column = 0; column < height; column++){
                boolean drawStar = ( (height - 1 - row) <= column
                        || row == height -1);

                if(drawStar){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    @Override
    public void drawOutline() {

        for (int row = 0; row < height; row++){

           for (int column = 0; column < height; column++) {
               boolean drawStar = ((height - 1 - row) == column) ||
                       row == height -1; //&&
               boolean drawWhiteSpace = (height - 1 - row > column);

               if (drawStar){
                   System.out.print("*");
               } else if (drawWhiteSpace) {
                   System.out.print(" ");
               }
           }
            System.out.println();
        }

    }

    @Override
    public void drawOutline(int height) {
        setHeight(height);

        for (int row = 0; row < height; row++){

            for (int column = 0; column < height; column++){
                boolean drawStar = (row == height -1)
                        || (height - row -1) == column;

                boolean drawWhiteSpace = (height - row - 1) > column;

                if (drawStar){
                    System.out.print("*");
                }else if(drawWhiteSpace){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public int getShapeHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
