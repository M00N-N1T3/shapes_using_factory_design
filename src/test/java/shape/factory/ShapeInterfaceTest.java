package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


import static  org.junit.jupiter.api.Assertions.*;

public class ShapeInterfaceTest {

    // checks whether we have interface or not
    @Test
    public void TestShapeClassISInterface(){
        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isInterface());
    }

    @Test
    public void containsDrawMethods(){
        List<Method> methods = List.of(Shape.class.getMethods());
        assertEquals(6, methods.size());
        Set<String> methodsFoundInInterface = methods.stream().map(Method::getName).collect(Collectors.toSet());
        List<String> expectedMethods = List.of("draw","drawOutline","getShapeHeight","getShapeName");
        assertTrue(methodsFoundInInterface.containsAll(expectedMethods));
    }

}
