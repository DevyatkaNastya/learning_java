/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosuper;

/**
 *
 * @author Nastya
 */

class Box {
    private double height;
    private double width;
    private double depth;
    
    Box (Box ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }
    
    Box () {
        height = -1;
        width = -1;
        depth = -1;
    }
    
    Box (double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    
    Box (double len) {
        height = width = depth = len;
    }
    
    double volume() {
        return height*width*depth;
    }
}

class BoxMassa extends Box {
    double massa;
    
    BoxMassa (BoxMassa ob) {
        super(ob);
        massa = ob.massa;
    }
    
    BoxMassa () {
        super();
        massa = -1;
    }
    
    BoxMassa (double h, double w, double d, double m) {
        super(h, w, d);
        massa = m;
    }
    
    BoxMassa (double len, double m) {
        super(len);
        massa = m;
    }
}

public class DemoSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoxMassa mybox1 = new BoxMassa(10, 20, 15, 34.5);
        BoxMassa mybox2 = new BoxMassa(2, 3, 4, 0.75);
        BoxMassa mybox3 = new BoxMassa();
        BoxMassa mybox4 = new BoxMassa(3, 2);
        BoxMassa myclone = new BoxMassa(mybox1);
        
        double vol;
        
        vol = mybox1.volume();
        System.out.println("V1 = " + vol);
        System.out.println("M1 = " + mybox1.massa);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("V2 = " + vol);
        System.out.println("M2 = " + mybox2.massa);
        System.out.println();
        
        vol = mybox3.volume();
        System.out.println("V3 = " + vol);
        System.out.println("M3 = " + mybox3.massa);
        System.out.println();
        
        vol = mybox4.volume();
        System.out.println("V cube = " + vol);
        System.out.println("M cube = " + mybox4.massa);
        System.out.println();
        
        vol = myclone.volume();
        System.out.println("V clone = " + vol);
        System.out.println("M clone = " + myclone.massa);
        System.out.println();
    }
    
}
