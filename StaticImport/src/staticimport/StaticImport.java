/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticimport;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Nastya
 */
public class StaticImport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double side1, side2;
        double hypot;
        
        side1 = 3.0;
        side2 = 4.0;
        
        hypot = sqrt(pow(side1,2) + pow(side2, 2));
        
        System.out.println("side1 = " + side1 + "\nside2 = " + side2 + "\nhypotenuza = " + hypot);
               
              
    }
    
}
