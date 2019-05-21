/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispatch;

/**
 *
 * @author Nastya
 */

class A {
    void callme() {
        System.out.println("callme A");
    }
}

class B extends A {
    void callme() {
        System.out.println("callme B");
    }
}

class C extends A {
    void callme() {
        System.out.println("callme C");
    }
}

public class Dispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r;
        
        r = a;
        r.callme();
        
        r = b;
        r.callme();
        
        r = c;
        r.callme();
    }
    
}
