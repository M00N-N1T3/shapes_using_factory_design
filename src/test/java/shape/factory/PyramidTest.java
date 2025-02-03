package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.exercise_one.shape.factory.Pyramid;
import org.exercise_one.shape.factory.Triangle;
import org.exercise_one.util.StdoutReader;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PyramidTest {

    @Test
    public void ClassImplementsShapeInterface(){
        Class<Pyramid> pyramidClass = Pyramid.class;
        Class<Shape> shapeInterface = Shape.class;

        assertTrue(shapeInterface.isAssignableFrom(pyramidClass));

        List<Method> methodsInClass = Arrays.stream(pyramidClass.getMethods()).toList();
        assertEquals(4,methodsInClass.size());

        Set<String> methodNamesFoundInClass = methodsInClass.stream().map(Method::getName)
                .collect(Collectors.toSet());
        List<String> namesOfExpectedMethod = List.of("draw","drawOutline");

        assertTrue(namesOfExpectedMethod.containsAll(methodNamesFoundInClass));
    }

    @Test
    public void getCorrectShapeName(){
        Pyramid pyramid = new Pyramid();
        assertEquals("pyramid", pyramid.getShapeName());
    }

    @Test
    public void getCorrectShapeHeight(){
        Pyramid pyramid = new Pyramid();
        assertEquals(6, pyramid.getShapeHeight());

        pyramid.setHeight(2);
        assertEquals(2,pyramid.getShapeHeight());
    }



    @Test
    public void drawDefaultPyramidShape(){
        StdoutReader stdoutReader = new StdoutReader();
        String expected = """
                     *     
                    * *    
                   * * *   
                  * * * *  
                 * * * * * 
                * * * * * *
                """.trim();

        stdoutReader.readStdOutput();
        Pyramid pyramid = new Pyramid();
        pyramid.draw();

        String result = stdoutReader.getText();
        assertEquals(expected, result);
    }

    @Test
    public void drawPyramidWithCustomHeight(){
        StdoutReader reader = new StdoutReader();
        String expected = """
                   *   
                  ***  
                 ***** 
                *******
                """.trim();


        reader.readStdOutput();
        Pyramid pyramid = new Pyramid();
        pyramid.draw(4);

        String result = reader.getText();
        assertEquals(expected,result);
    }

    @Test
    public void drawDefaultPyramidOutline(){
        String expected = """
                    *    
                   * *   
                  *   *  
                 *     * 
                *********
                """.trim();
        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Pyramid pyramid = new Pyramid();
        pyramid.drawOutline();

        String result = reader.getText();
        assertEquals(expected,result);
    }

    @Test
    public void drawPyramidOutlineWithCustomHeight(){
        String expected = """
                   *   
                  * *  
                 *   * 
                *******
                """.trim();

        StdoutReader reader = new StdoutReader();

        reader.readStdOutput();
        Pyramid pyramid = new Pyramid();
        pyramid.drawOutline(5);

        String result = reader.getText();
        assertEquals(expected,result);
    }

}
