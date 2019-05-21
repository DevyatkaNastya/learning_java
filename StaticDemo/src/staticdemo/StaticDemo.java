/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;

/**
 *
 * @author Nastya
 */

class StaticName {
    static int a = 42;
    static int b = 99;
    
    static void strptr(){
        System.out.println("b = " + b);
    }
}

public class StaticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticName.strptr();
        System.out.println("a = " + StaticName.a);
    }
    
}
