package shape.factory;

import org.exercise_one.shape.factory.Square;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

    @Test
    public void classImplementsShapeFactory(){
        Class<?>[] interfaces = Square.class.getInterfaces();
        assertTrue(interfaces.length > 0);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Square.class)); // checking if our square class is an instance of Shape

        List<Method> methodsInClass = Arrays.stream(Square.class.getMethods()).toList();
        Set<String> methodNamesFoundInClass = methodsInClass.stream().map(Method::getName)
                .collect(Collectors.toSet());
        List<String> namesOfExpectedMethod = List.of("draw","drawOutline");

        assertTrue(methodNamesFoundInClass.containsAll(namesOfExpectedMethod));
    }

    @Test
    public void correctShapeName(){
        Square square = new Square();
        assertEquals("square",square.getShapeName());
    }

    @Test
    public void correctShapeHeight(){
        Square square = new Square();
        assertEquals(6,square.getShapeHeight());

        square.setHeight(4);
        assertEquals(4,square.getShapeHeight());

    }

    @Test
    public void drawDefaultSquareShape(){
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

        assertEquals(Shape.DEFAULT_HEIGHT, square.getShapeHeight());
        assertEquals(expected, result);
    }

    @Test
    public void drawSquareWithCustomHeight(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                *****
                *****
                *****
                *****
                *****
                """.trim();

        stdoutReader.readStdOutput();
        Square square = new Square();
        square.draw(5);
        String result = stdoutReader.getText();

        assertEquals(5,square.getShapeHeight());
        assertEquals(expected,result);
    }

    @Test
    public void drawDefaultSquareOutline(){
        String expected = """
                ******
                *    *
                *    *
                *    *
                *    *
                ******
                """.trim();
        StdoutReader stdoutReader = new StdoutReader();

        stdoutReader.readStdOutput();
        Square square = new Square();
        square.drawOutline();
        String result = stdoutReader.getText();

        assertEquals(Shape.DEFAULT_HEIGHT, square.getShapeHeight());
        assertEquals(expected,result);
    }

    @Test
    public void drawSquareOutlineWithCustomHeight(){
        String expected = """
                *****
                *   *
                *   *
                *   *
                *****
                """.trim();
        StdoutReader stdoutReader = new StdoutReader();

        stdoutReader.readStdOutput();
        Square square = new Square();
        square.drawOutline(5);
        String result = stdoutReader.getText();

        assertEquals(5, square.getShapeHeight());
        assertEquals(expected,result);
    }


}
