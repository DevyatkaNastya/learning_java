/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoboxmassa;

/**
 *
 * @author Nastya
 */

class Box {
    double width;
    double height;
    double depth;
    
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    //    System.out.println("srabotalo");
    }
    
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }
    
    Box (double len) {
        width = height = depth = len;
    }
    
    double volume () {
        return width*height*depth;   
    }
}

class BoxMassa extends Box {
    double massa;
    
    BoxMassa (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        massa = m;
    }
}

public class DemoBoxMassa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoxMassa mybox1 = new BoxMassa(10, 20, 15, 34.5);
        BoxMassa mybox2 = new BoxMassa(2, 3, 4, 15);
        
        double vol;
        
        vol = mybox1.volume();
        System.out.println("V1 = " + vol);
        System.out.println("M1 = " + mybox1.massa);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("V2 = " + vol);
        System.out.println("M2 = " + mybox2.massa);
        
    }
    
}
