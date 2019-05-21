/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author Nastya
 */
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Count art: " + v.length + " content: ");
        
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
    
}
