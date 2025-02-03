package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.exercise_one.shape.factory.Shapes;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {

    @Test
    public void ClassContainsGetInstancesMethod(){
        Class<Shapes> shapeClass = Shapes.class;
        Set<String> methodsInClass = Arrays.stream(shapeClass.getMethods()).map(Method::getName).collect(Collectors.toSet());
        List<String> expectedMethodNames = List.of("getInstanceOf");
        assertTrue(methodsInClass.containsAll(expectedMethodNames));
    }

    @Test
    public void defaultShapeIsCircle(){
        Shapes shapes = new Shapes();
        Shape shape = shapes.getInstanceOf("merry Go Round");
        assertEquals("circle",shape.getShapeName());
    }

    @Test
    public void testShapeFactory(){
        Shapes shapes = new Shapes();

        List<String> shapeNames = List.of("square","rectangle","pyramid","circle","triangle");

        for (String shapeName: shapeNames){
            Shape generatedShape = shapes.getInstanceOf(shapeName);
            assertEquals(shapeName,generatedShape.getShapeName());
        }
    }


}
