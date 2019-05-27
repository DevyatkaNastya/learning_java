/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo3;

/**
 *
 * @author Nastya
 */

enum Apple {
    Golden(10), RedDel(11), Jonathan(9);
    private int price;
    
    Apple(int p) {
        price = p;
    }
    
    int getPrice(){
        return price;
    }
}

public class EnumDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Apple ap;
        
        System.out.println("Golden price = " + Apple.Golden.getPrice());
        
        System.out.println("All price: ");
        
        for(Apple a: Apple.values()) {
            System.out.println(a + " " + a.getPrice());
        }
    }
    
}
