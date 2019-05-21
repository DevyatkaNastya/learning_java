/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractareas;

/**
 *
 * @author Nastya
 */

abstract class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    abstract double area();
            
}

class Triangle extends Figure {
    Triangle (double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Trangle");
        return dim1*dim2;
    }
}

class Rectangle extends Figure {
    Rectangle (double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Rectangle");
        return dim1*dim2/2;
    }
}

public class AbstractAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        
        Figure figuref;
        
        figuref = r;
        System.out.println("S = " + figuref.area());
        
        figuref = t;
        System.out.println("S = " + figuref.area());
    }
    
}
