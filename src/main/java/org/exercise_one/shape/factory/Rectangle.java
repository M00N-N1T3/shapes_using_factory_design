package org.exercise_one.shape.factory;

public class Rectangle  implements Shape{
    private int height = DEFAULT_HEIGHT;
    private int width = height * 2;

    @Override
    public void draw() {
        for (int row= 0; row < height; row++){
            for (int column = 0; column < width; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height) {
       setHeight(height);

        for (int row= 0; row < height; row++){
            for (int column = 0; column < width; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline() {
        for (int row= 0; row < height; row++){
            for (int column = 0; column < width; column++){

                if (row == 0 || row == height -1
                        || column == 0 || column == width -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline(int height) {
        setHeight(height);

        for (int row = 0; row < height; row ++){

            for (int column = 0; column < width; column ++){
                if (row == 0 || row == height -1
                        || column == 0 || column == width -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String getShapeName() {
        return "rectangle";
    }

    @Override
    public int getShapeHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.width = height * 2;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.drawOutline(5);
    }
}
