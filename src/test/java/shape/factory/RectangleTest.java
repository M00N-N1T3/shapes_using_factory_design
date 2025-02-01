package shape.factory;

import org.exercise_one.shape.factory.Rectangle;
import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void classImplementsShapeInterface(){
        Class<?>[] interfaces = Rectangle.class.getInterfaces();
        assertEquals(interfaces.length, 1);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Rectangle.class));
    }
}
