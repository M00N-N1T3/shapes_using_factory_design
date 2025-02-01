package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


import static  org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    // checks whether we have interface or not
    @Test
    public void TestShapeClassISInterface(){
        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isInterface());
    }

    @Test
    public void containsDrawMethods(){
        List<Method> methods = List.of(Shape.class.getMethods());
        assertEquals(2, methods.size());
        Set<String> methodNames = methods.stream().map(Method::getName).collect(Collectors.toSet());
        assertTrue(methodNames.contains("draw"));
    }

}
