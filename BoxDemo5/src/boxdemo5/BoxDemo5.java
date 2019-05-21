/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxdemo5;

/**
 *
 * @author Nastya
 */

class Box {
    double height, weight, depth;
    
    double volume() {
        return height*weight*depth;
    }
    
    void setDim(double h, double w, double d) {
        height = h;
        weight = w;
        depth = d;
    } 
}

public class BoxDemo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 4, 5);
        
        System.out.println("V = " + mybox1.volume());
        System.out.println("V = " + mybox2.volume());
        
        
    }
    
}
