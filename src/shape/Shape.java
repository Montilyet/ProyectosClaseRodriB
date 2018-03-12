/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Rodrigo Bosarreyes
 */
public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGLE = 3;
    
    private int shapeType;
    private double size;
    
    public Shape() {
        setType(1);
        setSize(21.0);
    }
    
    public Shape(double size){
        setType(1);
        setSize(size);
    }
    
    public Shape(int shapeType, double size) {
        setType(shapeType);
        setSize(size);
    }
    
    private void setSize(double size) {
        if(size<=0) {
        throw new IllegalArgumentException("El tamaño no puede ser menor que 0"+"(size = "+size+")");
        } else{
            this.size = size;
        }
    }
    
    public final void setType(int shapeType) {
        if(shapeType == 1 || shapeType == 2 || shapeType == 3) {
            this.shapeType = shapeType;
        } else { 
            this.shapeType = 0; 	
        }
    }
    
    // ... other methods ...
    public double area() {
         
        switch (shapeType) {
            case SQUARE:     
                return size*size;
            case CIRCLE:     
                return Math.PI*size*size/4.0;
            case RIGHT_TRIANGLE: 
                return size*size/2.0;
        }
        return 0;
    }
}