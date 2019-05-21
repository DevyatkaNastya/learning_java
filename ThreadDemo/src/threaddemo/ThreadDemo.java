/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Nastya
 */

class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Demo");
        System.out.println("Demo created " + t);
        t.start();
    }
    
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(t.getName()+ " " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Demo broken");
        }
        System.out.println("Demo exit");
    }
}

public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = Thread.currentThread();
        new NewThread();
        
        try {
            for (int i = 5; i > 0; i --) {
                System.out.println(t.getName()+ " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main broken");
        }
        System.out.println("Main exit");
    }
    
}
