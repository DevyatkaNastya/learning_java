/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadcons2;

/**
 *
 * @author Nastya
 */

class Box {
    double height, weight, depth;
    
    Box(double h, double w, double d) {
        height = h;
        weight = w;
        depth = d;
    }
    
    Box(double len) {
        height = weight = depth = len;
    }
    
    Box() {
        height = weight = depth = -1;
    }
    
    Box(Box ob) {
        height = ob.height;
        weight = ob.weight;
        depth = ob.depth; 
    }
    
    double volume (){
        return height*weight*depth;
    }
}

public class OverloadCons2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box (10, 15, 20);
        Box mybox2 = new Box (3);
        Box mybox3 = new Box();
        Box boxcopy = new Box(mybox1);
        
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        System.out.println(boxcopy.volume());
    }
    
}
