package Tests;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.unicauca.edu.polymorphismactivity.models.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juans
 * @author alexp
 */
public class TriangleTest {

    @Test
    public void testCalculateArea() {
        Triangle t = new Triangle(5, 6, 7);
        assertEquals(15, t.calculateArea());
    }

    @Test
    public void testCalculatePerimeterTriangle() {
        Triangle t = new Triangle(5, 6, 7);
        assertEquals(18, t.calculatePerimeter());
    }
}