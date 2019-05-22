/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

/**
 *
 * @author Nastya
 */
public class Synch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Welcome to");
        Caller ob2 = new Caller(target, "synchronized");
        Caller ob3 = new Caller(target, "world");
        
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Stoped");
        }
    }
    
}
