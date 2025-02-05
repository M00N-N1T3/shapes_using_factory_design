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
        assertEquals(1, interfaces.length);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Triangle.class));
    }

    @Test
    public void getCorrectShapeName(){
       Triangle triangle = new Triangle();
        assertEquals("triangle", triangle.getShapeName());
    }

    @Test
    public void getCorrectShapeHeight(){
        Triangle triangle = new Triangle();
        assertEquals(6, triangle.getShapeHeight());

       triangle.setHeight(2);
        assertEquals(2,triangle.getShapeHeight());
    }


    @Test
    public void drawDefaultTriangleShape(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                     *
                    **
                   ***
                  ****
                 *****
                ******
                """.trim();

        stdoutReader.readStdOutput();
        Triangle triangle = new Triangle();
        triangle.draw();

        String result = stdoutReader.getText().trim();
        assertEquals(expected, result);
    }

    @Test
    public void drawTriangleWithCustomHeight(){
        StdoutReader reader = new StdoutReader();
        String expected = """
                   *
                  **
                 ***
                ****
                """.trim();


        reader.readStdOutput();
        Triangle triangle = new Triangle();
        triangle.draw(4);

        String result = reader.getText().trim();
        assertEquals(expected,result);
    }

    @Test
    public void drawDefaultTriangleOutline(){
        String expected = """
                     *
                    * 
                   *  
                  *   
                 *    
                ******
                """.trim();
        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Triangle triangle = new Triangle();
        triangle.drawOutline();

        String result = reader.getText().trim();
        assertEquals(expected,result);
    }

    @Test
    public void drawTriangleOutlineWithCustomHeight(){
        String expected = """
                    *
                   *
                  *
                 *
                *****
                """.trim();

        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Triangle triangle = new Triangle();
        triangle.drawOutline(5);

        String result = reader.getText().trim();
        assertEquals(expected,result);
    }
}
