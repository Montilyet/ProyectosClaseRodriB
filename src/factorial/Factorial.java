/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Rodrigo Bosarreyes
 */
public class Factorial {
    
    public static int calcular( int n ){ 
        if( n < 0 ){ 
            throwArgumentExc(n);
        } 
        int fact = calcFact(n);
        if( fact <= 0 ){ 
            throwArithExc(n);
        } 
        return fact; 
    } 
    
    private static void throwArgumentExc(int n) {
        throw new IllegalArgumentException("Número " + n + " no puede ser < 0");
    }

    private static void throwArithExc(int n) {
        throw new ArithmeticException("Overflow, número " + n + " demasiado grande"); 
    }

    private static int calcFact(int n) {
        int fact = 1; 
            for( int i = 2; i <= n; i++ ){ 
                fact *= i; 
            }
        return fact;
    }
}

