/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import factorial.Factorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Bosarreyes
 */
public class FactorialTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void calcTest(){
        int n = -1;
        Factorial.calcular(n);
    }
    @Test(expected = ArithmeticException.class)
    public void calcTest2(){
        int n = 999999;
        Factorial.calcular(n);
    }
    @Test
    public void calcTest3(){
        int n = 4;
        int expected = 24;
        int result = Factorial.calcular(n);
        assertEquals(expected, result);
        n = 0;
        expected = 1;
        result = Factorial.calcular(n);
        assertEquals(expected, result);
    }
}

