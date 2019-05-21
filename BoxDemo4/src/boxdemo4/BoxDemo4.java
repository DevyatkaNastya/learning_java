/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxdemo4;

/**
 *
 * @author Nastya
 */

class Box {
    double height;
    double weidth;
    double depth; 
    
    double volume() {
        return height*weidth*depth;
    }
}

public class BoxDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.depth = 10;
        mybox1.height = 15;
        mybox1.weidth = 20 ;
        
        
        mybox2.depth = 3;
        mybox2.height = 4;
        mybox2.weidth = 5;
        
        System.out.println("V = " + mybox1.volume());
        System.out.println("V = " + mybox2.volume());
    }
    
}
