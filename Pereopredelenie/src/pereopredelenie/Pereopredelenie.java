/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pereopredelenie;

/**
 *
 * @author Nastya
 */

class A {
    int i, j;
    A (int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i j = " + i  + " " + j);
    }
}

class B extends A {
    int k;
    B (int a, int b, int c) {
        super(a,b);
        k = c;
    }
    void show() {
        super.show();
        System.out.println("k = " +k);
    }
}

public class Pereopredelenie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B (1,2,3);
        subOb.show();
    }
    
}
