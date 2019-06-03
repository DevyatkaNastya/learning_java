/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gendemo;

/**
 *
 * @author Nastya
 */
class Gen<T> {
    T ob;
    Gen (T o) {
        ob = o;
    }
    
    T getob() {
        return ob;
    }
    
    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
public class GenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gen<Integer> iOb;
        
        iOb = new Gen<Integer>(88);
        
        iOb.showType();
        
        int v = iOb.getob();
        System.out.println("Value = " + v);
        System.out.println();
        
        Gen<String> iOs;
        
        iOs = new Gen<String>("Text");
        
        iOs.showType();
        
        String s = iOs.getob();
        System.out.println("Value = "+ s);
    }
    
}
