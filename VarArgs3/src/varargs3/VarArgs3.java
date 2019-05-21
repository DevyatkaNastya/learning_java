/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs3;

/**
 *
 * @author Nastya
 */
public class VarArgs3 {
    static void vaTest(int ... v) {
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    static void vaTest(boolean ... v) {
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + " ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest(1, 2, 3);
        vaTest("Test", 10, 20);
        vaTest(true, false, false);
    }
    
}
