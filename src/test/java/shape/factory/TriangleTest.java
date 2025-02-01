package shape.factory;

import org.exercise_one.shape.factory.Triangle;
import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Triangle.class.getInterfaces();
        assertEquals(interfaces.length, 1);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Triangle.class));
    }
}
