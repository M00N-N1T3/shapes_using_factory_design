package org.exercise_one.shape.factory;

public class Pyramid implements Shape{
    private int height = DEFAULT_HEIGHT;

    @Override
    public void draw() {
        // I know the nesting in this section is going to be a mess!
        for (int row = 0; row < height;row++){
            boolean finishedDrawingStars = false;

            for (int column = 0; column < height * 2; column++){

                boolean startDrawingStars = height - row -1 == column;
                int numberOfStars = (row + 1);

                if (startDrawingStars) {
                    int count = 1;
                    // we need the loop to run for as long as the number of stars
                    while (count <= numberOfStars) {
                        String starToDraw = (count == numberOfStars) ? "*" : "* ";
                        System.out.print(starToDraw);

                        count++;
                        column += ("*".equals(starToDraw)) ? 1 : 2; // incrementing column number
                        // to ensure column consitency
                    }

                    finishedDrawingStars = true;
                }else {
                    System.out.print(" ");
                }

                if (finishedDrawingStars) break;
            }
            System.out.println();
        }
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

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.draw();
    }
}
