package shape.factory;

import org.exercise_one.shape.factory.Square;
import org.exercise_one.shape.factory.Shape;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

    @Test
    public void classImplementsShapeFactory(){
        Class<?>[] interfaces = Square.class.getInterfaces();
        assertTrue(interfaces.length > 0);

        Class<?> shapeInterface = Shape.class;
        assertTrue(shapeInterface.isAssignableFrom(Square.class)); // checking if our square class is an instance of Shape

        // alternatives
        // assertTrue( shapeInterface.class.isInstance(Square.class) );
        // asserTrue( Square.class instanceof ShapeInterface.class );
    }


}
