package shape.factory;

import org.exercise_one.shape.factory.Circle;
import org.exercise_one.shape.factory.Shape;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Circle.class.getInterfaces();
        Class<?> shapeInterface = Shape.class;

        assertEquals(1, interfaces.length);
        assertTrue(shapeInterface.isAssignableFrom(Circle.class));

        List<Method> methodsInClass = Arrays.stream(Circle.class.getMethods()).toList();
        Set<String> methodNamesFoundInClass = methodsInClass.stream().map(Method::getName)
                .collect(Collectors.toSet());
        List<String> namesOfExpectedMethod = List.of("draw","drawOutline");

        assertTrue(methodNamesFoundInClass.containsAll(namesOfExpectedMethod));
    }

    @Test
    public void getCorrectShapeName(){
        Circle circle = new Circle();
        assertEquals("circle", circle.getShapeName());
    }

    @Test
    public void getCorrectShapeHeight(){
        Circle circle = new Circle();
        assertEquals(6, circle.getShapeHeight());

        circle.setHeight(12);
        assertEquals(12,circle.getShapeHeight());
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
        String result = reader.getText().trim();

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
                ********
                  ****  
                """.trim();

        StdoutReader reader = new StdoutReader();
        reader.readStdOutput();

        Circle circle = new Circle();
        circle.draw(8);
        String result = reader.getText().trim();

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
        String result = reader.getText().trim();

        assertEquals(expected, result);
    }

    @Test
    public void drawOutlineWithCustomHeight(){
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
        String result = reader.getText().trim();

        assertEquals(expected, result);
    }
}
