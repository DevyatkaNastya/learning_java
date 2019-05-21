/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoshipment;

/**
 *
 * @author Nastya
 */
class Box {
    private double width;
    private double height;
    private double depth;
    
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    Box () {
        width = height = depth = -1;
    }
    
    Box (double len) {
        width = height = depth = len;
    }
    
    double volume() {
        return width*height*depth;
    }
}

class BoxWeight extends Box {
    double weight;
    
    BoxWeight (BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    
    BoxWeight (double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    
    BoxWeight () {
        super();
        weight = -1;
    }
    
    BoxWeight (double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;
    
    Shipment (Shipment ob) {
        super (ob);
        cost = ob.cost;
    }
    
    Shipment (double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    
    Shipment () {
        super();
        cost = -1;
    }
    
    Shipment (double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shipment ship1  = new Shipment (10, 20, 15, 10, 3.41);
        Shipment ship2 = new Shipment (1, 2, 3, 4, 5);
        
        double vol;
        vol = ship1.volume();
        System.out.println("v1 = " + vol);
        System.out.println("m1 = " + ship1.weight);
        System.out.println("cost1 = " + ship1.cost);
        System.out.println();
        
        vol = ship2.volume();
        System.out.println("v2 = " + vol);
        System.out.println("m2 = " + ship2.weight);
        System.out.println("cost2 = " + ship2.cost);
        System.out.println();
        
    }
    
}
