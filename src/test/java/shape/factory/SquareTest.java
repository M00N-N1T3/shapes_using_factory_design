package shape.factory;

import org.exercise_one.shape.factory.Square;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

    @Test
    public void classImplementsShapeFactory(){
        Class<?>[] interfaces = Square.class.getInterfaces();
        assertTrue(interfaces.length > 0);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Square.class)); // checking if our square class is an instance of Shape

        // alternatives
        // assertTrue( shapeInterface.class.isInstance(Square.class) );
        // asserTrue( Square.class instanceof ShapeInterface.class );
    }

    @Test
    public void drawDefaultShape(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                ******
                ******
                ******
                ******
                ******
                ******
                """.trim();

        stdoutReader.readStdOutput();
        Square square = new Square();
        square.draw();

        String result = stdoutReader.getText();
        assertEquals(expected, result);
    }

    @Test
    public void drawSquareWithCustomHeight(){
        StdoutReader reader = new StdoutReader();
        String expected = """
                *****
                *****
                *****
                *****
                *****
                """.trim();

        reader.readStdOutput();
        Square square = new Square();
        square.draw(5);

        String result = reader.getText();
        assertEquals(expected,result);
    }


}
