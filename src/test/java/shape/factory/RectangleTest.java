package shape.factory;


import org.exercise_one.shape.factory.Rectangle;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Rectangle.class.getInterfaces();
        Class<?> shapeInterface = Shape.class;

        assertEquals(interfaces.length, 1);
        assertTrue(shapeInterface.isAssignableFrom(Rectangle.class));

        List<Method> methodsInClass = Arrays.stream(Rectangle.class.getMethods()).toList();
        Set<String> methodNamesFoundInClass = methodsInClass.stream().map(Method::getName)
                .collect(Collectors.toSet());
        List<String> namesOfExpectedMethod = List.of("draw","drawOutline");

        assertTrue(methodNamesFoundInClass.containsAll(namesOfExpectedMethod));

    }

    @Test
    public void getCorrectShapeName(){
        Rectangle rectangle = new Rectangle();
        assertEquals("rectangle",rectangle.getShapeName());
    }

    @Test
    public void getCorrectShapeHeight(){
        Rectangle rectangle = new Rectangle();
        assertEquals(6,rectangle.getShapeHeight());

        rectangle.setHeight(2);
        assertEquals(2, rectangle.getShapeHeight());
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
        String result = stdoutReader.getText().trim();

        assertEquals(Shape.DEFAULT_HEIGHT, rectangle.getShapeHeight());
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
        String result = reader.getText().trim();

        assertEquals(5, rectangle.getShapeHeight());
        assertEquals(expected,result);
    }

    @Test
    public void drawDefaultRectangleOutline(){
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
        String result = reader.getText().trim();

        assertEquals(Shape.DEFAULT_HEIGHT, rectangle.getShapeHeight());
        assertEquals(expected,result);
    }

    @Test
    public void drawRectangleOutlineWithCustomHeight(){
        String expected = """
                **********
                *        *
                *        *
                *        *
                **********
                """.trim();

        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Rectangle rectangle = new Rectangle();
        rectangle.drawOutline(5);
        String result = reader.getText().trim();

        assertEquals(5, rectangle.getShapeHeight());
        assertEquals(expected,result);
    }
}
