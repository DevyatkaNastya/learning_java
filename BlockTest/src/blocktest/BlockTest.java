/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocktest;

/**
 *
 * @author Nastya
 */
public class BlockTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        y = 20;
        for(x = 0; x < 10; x++){
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            y = y - 2;
        }
    }
    
}
