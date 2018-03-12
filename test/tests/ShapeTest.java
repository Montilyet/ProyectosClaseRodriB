package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import shape.Shape;

/**
 *
 * @author Rodrigo Bosarreyes
 */
public class ShapeTest {
    
    @Test
    public void square() {
        Shape shape = new Shape(1, 5.0);
        double result = shape.area();
        assertEquals(25, result, 0.2);
    }
    
    @Test
    public void circle() {
        Shape shape = new Shape(2, 5.0);
        double result = shape.area();
        assertEquals(19, result, 1.0);
    }
    @Test
    public void triangle() {
        Shape shape = new Shape(3, 5.0);
        double result = shape.area();
        assertEquals(12.5, result, 0.2);
    }
    @Test
    public void any() {
        Shape shape = new Shape(4, 5.0);
        double result = shape.area();
        assertEquals(0, result, 0.2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void zero() {
        Shape shape = new Shape(3, 0.0);
        double result = shape.area();
    }
}
