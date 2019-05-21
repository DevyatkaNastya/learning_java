/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftest3;

/**
 *
 * @author Nastya
 */
interface IntStack {
    void push(int item);
    int pop();
}
public class IFTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntStack mystack;
        FixedStack fs = new FixedStack(8);
        DynStack  ds = new DynStack(12);
        
        mystack = fs;
        for(int i = 0; i < 8; i++)
            mystack.push(i);
        
        mystack = ds;
        for(int i = 0; i < 16; i++)
            mystack.push(i);
        
        mystack = fs;
        System.out.println("Fixed");
        for(int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
        
        mystack = ds;
        System.out.println("Dynamic");
        for(int i = 0; i < 16; i++)
            System.out.println(mystack.pop());
        
        
    }
    
}
