/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojoin;

/**
 *
 * @author Nastya
 */
public class DemoJoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Tree");
        
        System.out.println("process 1 - " + ob1.t.isAlive());
        System.out.println("process 2 - " + ob2.t.isAlive());
        System.out.println("process 3 - " + ob3.t.isAlive());
        
        try {
            System.out.println("w8 thread's");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main broken");
        }
        System.out.println(" thread 1 - " + ob1.t.isAlive());
        System.out.println(" thread 2 - " + ob2.t.isAlive());
        System.out.println(" thread 3 - " + ob3.t.isAlive());
        
        System.out.println("main exit");
    }
    
}
