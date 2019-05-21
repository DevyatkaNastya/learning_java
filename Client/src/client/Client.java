/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Nastya
 */
interface Callback{
    void callback(int param);
}
public class Client implements Callback {
public void callback(int p) {
    System.out.println("Callback =" + p);
}

void nonInterfaceMeth() {
    System.out.println("Non interface");
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
