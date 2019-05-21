/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Nastya
 */

class Factorial {
    int fact(int n) {
        int result;
        
        if (n==1) return 1;
        result = fact(n-1)*n;
        System.out.println("res " + result);
        return result;
    }
}

public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial f = new Factorial();
        
        System.out.println("F 3 = " + f.fact(3));
        System.out.println("F 4 = " + f.fact(4));
        System.out.println("F 5 = " + f.fact(5));
    }
    
}
