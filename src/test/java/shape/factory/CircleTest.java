package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.exercise_one.shape.factory.Circle;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Circle.class.getInterfaces();
        assertEquals(interfaces.length, 1);
        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isInstance(Circle.class));
    }
}
