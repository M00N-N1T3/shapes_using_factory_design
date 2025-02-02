package shape.factory;

import org.exercise_one.shape.factory.Rectangle;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Rectangle.class.getInterfaces();
        assertEquals(interfaces.length, 1);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Rectangle.class));
    }

    @Test
    public void drawDefaultRectangleShape(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                ************
                ************
                ************
                ************
                ************
                ************
                """.trim();

        stdoutReader.readStdOutput();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

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
