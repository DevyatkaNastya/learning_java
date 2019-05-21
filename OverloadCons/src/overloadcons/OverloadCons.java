/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadcons;

/**
 *
 * @author Nastya
 */

class Box {
    double height, weight, depth;
    
    Box (double h, double w, double d) {
        height = h;
        weight = w;
        depth = d;
    }
    
    Box () {
        height = -1;
        weight = -1;
        depth = -1;
        }
    
    Box (double len) {
        height = weight = depth = len;
    }
    
    double volume () {
        return height * weight * depth;
    }
}

public class OverloadCons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        
    }
    
}
