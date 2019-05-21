/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Nastya
 */

class OverloadDemo {
    void test() {
        System.out.println("void");
    }
    
    void test (int a) {
        System.out.println(a);
    }
    
    void test (int a, int b) {
        System.out.println(a + " " + b);
    }
    
    double test (double a) {
        System.out.println(a);
        return a*a;
    }
}

public class Overload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("res = " + result);
    }
    
}
