/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc2;

/**
 *
 * @author Nastya
 */
public class Exc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, d;
        
        try{
            d = 0;
            a = 42/d;
            System.out.println("Not printed");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("After catch");
    }
    
}
