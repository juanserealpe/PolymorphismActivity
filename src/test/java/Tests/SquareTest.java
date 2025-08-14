package Tests;

import com.unicauca.edu.polymorphismactivity.models.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juans
 * @author alexp
 */
public class SquareTest {

    @Test
    public void testCalculateArea() {
        Square s = new Square(4, 4);
        assertEquals(16, s.calculateArea());
    }

    @Test
    public void testCalculatePerimeterSquare() {
        Square s = new Square(4, 4);
        assertEquals(16, s.calculatePerimeter());
    }

    @Test
    public void testCalculatePerimeterRectangle() {
        Square r = new Square(4, 6);
        assertEquals(20, r.calculatePerimeter());
    }
}
