package Tests;

import com.unicauca.edu.polymorphismactivity.models.Circle; // Importa tu clase Circle
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juans
 * @author alexp
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Iniciando pruebas de Circle...");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Pruebas de Circle finalizadas.");
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalculateAreaWithRadius() {
        Circle c = new Circle(5); // radio = 5
        double expected = Math.PI * 25; // π * r²
        assertEquals(expected, c.calculateAreaWithRadious(), 0.0001, "El área con radio no es correcta");
    }

    @Test
    public void testCalculatePerimeterWithRadius() {
        Circle c = new Circle(5);
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, c.calculatePerimeter(), 0.0001, "El perímetro con radio no es correcto");
    }

    @Test
    public void testCalculateAreaAsEllipse() {
        Circle e = new Circle(4, 3); // a = 4, b = 3
        double expected = Math.PI * 4 * 3; // Fórmula elipse
        assertEquals(expected, e.calculateArea(), 0.0001, "El área de la elipse no es correcta");
    }
}
