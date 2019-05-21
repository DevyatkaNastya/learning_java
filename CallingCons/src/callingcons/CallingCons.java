/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callingcons;

/**
 *
 * @author Nastya
 */

class A {
    A() {
        System.out.println("Cons A");
    }
}

class B extends A {
    B() {
        System.out.println("Cons B");
    }
}

class C extends B {
    C() {
        System.out.println("Cons C");
    }
}

public class CallingCons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        C c = new C();
    }
    
}
