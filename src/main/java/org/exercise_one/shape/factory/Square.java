package org.exercise_one.shape.factory;

public class Square implements Shape {

    @Override
    public void draw() {
        for (int row = 0; row < 6; row++ ){
            for (int colum = 0; colum < 6; colum++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void draw(int height){
        for (int row = 0; row < height; row++ ){
            for (int colum = 0; colum < height; colum++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void drawOutline(){
        //
    }

    @Override
    public void drawOutline(int height) {

    }
}
