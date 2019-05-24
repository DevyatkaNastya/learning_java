/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author Nastya
 */

enum Apple {
    Jonathan, Golden, Red, Cortland
}

public class EnumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Apple ap;
        
        ap = Apple.Red;
        
        System.out.println(ap);
        System.out.println();
        
        ap = Apple.Golden;
        
        if (ap == Apple.Golden) 
            System.out.println("ap == Apple.Golden \n");
        
        
        //enum for switch
        
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case Golden:
                System.out.println("Golden is yellow");
                break;
            case Red:
                System.out.println("Red is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
    
}
