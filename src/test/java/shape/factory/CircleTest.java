package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.exercise_one.shape.factory.Circle;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Circle.class.getInterfaces();
        assertEquals(interfaces.length, 1);
        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isInstance(Circle.class));
    }

    @Test
    public void drawDefaultCircleShape(){
        String expected = """
                  **  
                ******
                ******
                ******
                ******
                  **  
                """.trim();

        StdoutReader reader = new StdoutReader();
        reader.readStdOutput();

        Circle circle = new Circle();
        circle.draw();
        String result = reader.getText();

        assertEquals(expected, result);
    }

    @Test
    public void drawCircleWithCustomHeight(){
        String expected = """
                  ****  
                ********
                ********
                ********
                ********
                ********
                *******
                  ****  
                """.trim();

        StdoutReader reader = new StdoutReader();
        reader.readStdOutput();

        Circle circle = new Circle();
        circle.draw(8);
        String result = reader.getText();

        assertEquals(expected, result);
    }

    @Test
    public void drawCircleOutline(){
        String expected = """
                  **  
                *    *
                *    *
                *    *
                *    *
                  **  
                """.trim();

        StdoutReader reader = new StdoutReader();
        reader.readStdOutput();

        Circle circle = new Circle();
        circle.drawOutline();
        String result = reader.getText();

        assertEquals(expected, result);
    }

    @Test
    public void drawDefaultShape(){
        String expected = """
                  ****  
                *      *
                *      *
                *      *
                *      *
                *      *
                *      *
                  ****  
                """.trim();

        StdoutReader reader = new StdoutReader();
        reader.readStdOutput();

        Circle circle = new Circle();
        circle.drawOutline(8);
        String result = reader.getText();

        assertEquals(expected, result);
    }
}
