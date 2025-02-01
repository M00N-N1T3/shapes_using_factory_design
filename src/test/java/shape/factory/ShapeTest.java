package shape.factory;

import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.*;
import static  org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    // checks whether we have interface or not
    @Test
    public void TestShapeClassISInterface(){
        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isInterface());
    }

}
