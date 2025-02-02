package shape.factory;

import org.exercise_one.shape.factory.Triangle;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Triangle.class.getInterfaces();
        assertEquals(interfaces.length, 1);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Triangle.class));
    }

    @Test
    public void drawDefaultTriangleShape(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                   *    
                  ***   
                 ***** 
                *******
                """.trim();

        stdoutReader.readStdOutput();
        Triangle triangle = new Triangle();
        triangle.draw();

        String result = stdoutReader.getText();
        assertEquals(expected, result);
    }

    @Test
    public void drawRectangleWithCustomHeight(){
        StdoutReader reader = new StdoutReader();
        String expected = """
                **********
                **********
                **********
                **********
                **********
                """.trim();

        reader.readStdOutput();
        Rectangle rectangle = new Rectangle();
        rectangle.draw(5);

        String result = reader.getText();
        assertEquals(expected,result);
    }

    @Test
    public void drawDefaultSquareOutline(){
        String expected = """
                ************
                *          *
                *          *
                *          *
                *          *
                ************
                """.trim();
        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Rectangle rectangle = new Rectangle();
        rectangle.drawOutline();

        String result = reader.getText();
        assertEquals(expected,result);
    }

    @Test
    public void drawSquareOutlineWithCustomHeight(){
        String expected = """
                ************
                *          *
                *          *
                *          *
                ************
                """.trim();
        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Rectangle rectangle = new Rectangle();
        rectangle.drawOutline(5);

        String result = reader.getText();
        assertEquals(expected,result);
    }
}
