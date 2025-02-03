package org.exercise_one.shape.factory;

public class Circle implements Shape{

    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {
        for (int row = 0; row < height; row ++){
            for (int column = 0; column < height; column++){
                boolean drawStar = height/2 - 1 == column
                        || height/2 == column
                        || row > 0 && row < height -1;

                if(drawStar) {
                    System.out.print("*");
                }else if (row == 0 && column > height/2){
                    continue;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height) {
        // height correction, because this is a practice exercise I only want even numbers
        height = (height % 2 == 0) ? height : height + 1;
        setHeight(height);

        for (int row = 0; row < height; row++){
            for (int column = 0; column < height; column ++){
                boolean drawStar =  column > 1 && column < height -2
                        || row > 0 && row < height -1;

                if (drawStar) {
                    System.out.print("*");
                }else if (column > height/2){
                    continue;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    @Override
    public void drawOutline(int height) {
        height = (height % 2 == 0) ? height : height + 1;
        setHeight(height);

        for (int row=0; row < height;row++){
            for (int column = 0; column < height; column++){

                boolean columnInValidRange = column > 1 && column < height - 2;
                boolean rowInValidRange = row > 0 && row < height -1;

                boolean drawStar =  (row == 0 && (columnInValidRange))
                        || (row == height -1 && (columnInValidRange))
                        || (column == 0 && (rowInValidRange) )
                        || (column == height -1 && (rowInValidRange) );

                if (drawStar){
                    System.out.print("*");
                } else if ( row == 0 && column >= height - 2) {
                    continue;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    @Override
    public void drawOutline(){

        for (int row = 0; row < height; row++){
            boolean rowInValidRange = row > 0 && row < height -1;

            for (int column = 0; column < height; column ++){
                boolean columnInValidRange = column > 1 && column < height - 2;

                boolean drawStar = (row == 0 && columnInValidRange)
                        || row == height -1 && columnInValidRange
                        || column == 0 && rowInValidRange
                        || column == height - 1 && rowInValidRange;


                if (drawStar){
                    System.out.print("*");
                } else if (row == 0 && column >= height -2) {
                    continue;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public int getShapeHeight() {
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawOutline();
    }
}
