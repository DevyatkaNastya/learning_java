/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendthread;

/**
 *
 * @author Nastya
 */

class NewThread extends Thread {
    NewThread() {
        super("Demo");
        System.out.println("Demo " + this);
        start();
    }
    
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Demo i = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Demo broken");
        }
        System.out.println("Demo exit");
    }
}

public class ExtendThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NewThread();
        
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("main i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main broken");
        }
        System.out.println("main exit");
    }
    
}
