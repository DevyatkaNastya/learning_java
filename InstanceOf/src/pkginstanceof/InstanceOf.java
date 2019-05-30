/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

/**
 *
 * @author Nastya
 */
class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        if(a instanceof A) 
            System.out.println("a is class A");
        
        if(b instanceof B)
            System.out.println("b is class B");
        
        if(c instanceof C)
            System.out.println("c is class C");
        
        if(c instanceof A)
            System.out.println("c may be A");
        
        A ob;
        
        ob = d;
        System.out.println("ob = d");
        
        if(ob instanceof D)
            System.out.println("ob is class D");
        
        ob = c;
        System.out.println("ob = c");
        
        if(ob instanceof D)
            System.out.println("ob is class D");
        else
            System.out.println("ob is not class D");
        
        if(ob instanceof Object && a instanceof Object && c instanceof Object && b instanceof Object )
            System.out.println("all is Object");
    }
    
}
