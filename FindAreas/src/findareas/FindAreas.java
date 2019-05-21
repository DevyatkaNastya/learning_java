/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findareas;

/**
 *
 * @author Nastya
 */

class Figure {
    double dim1;
    double dim2;
    
    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    double area() {
        System.out.println("Area not found");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle (double a, double b) {
        super (a,b);
    }
    
    double area() {
        System.out.println("Area rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle (double a, double b) {
        super (a,b);
    }
    
    double area () {
        System.out.println("Area triangle");
        return dim1 * dim2/2;
    }
}

public class FindAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figure f = new Figure(10, 10);
        Triangle t = new Triangle(10, 8);
        Rectangle r = new Rectangle(9, 5);
        
        Figure figuref;
        
        figuref = f;
        System.out.println("S = " + figuref.area());
        
        figuref = t;
        System.out.println("S = " + figuref.area());
        
        figuref = r;
        System.out.println("S = " + figuref.area());
    }
    
}
