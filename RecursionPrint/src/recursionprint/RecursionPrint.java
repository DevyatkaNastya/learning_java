/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionprint;

/**
 *
 * @author Nastya
 */

class Recursion {
    int i = 1;
    void rprint(int mass []) {
        if (mass.length == 1) 
            System.out.println(mass[0]);
        if (mass.length != 1) {
            if(i< mass.length) {
                System.out.println(mass[mass.length - i]);
                i++;
            //    rprint(mass[]);
            rprint(mass []);
            }
        }
    }
}

public class RecursionPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
