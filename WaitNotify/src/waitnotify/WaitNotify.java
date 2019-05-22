/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnotify;

/**
 *
 * @author Nastya
 */
public class WaitNotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        
        System.out.println("For stop press Control-C");
    }
    
}
