/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassdemo;

/**
 *
 * @author Nastya
 */

class Outer {
    int outer_x = 100;
    
    void test () {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display () {
                    System.out.println("wywod " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Outer outer = new Outer();
        outer.test();
    }
    
}
