/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack2;

/**
 *
 * @author Nastya
 */

class Stack {
    private int stck[] = new int [10];
    private int tos;
    
    Stack() {
    tos = -1;
    }
    
    void push(int item){
        if (tos == 9)
            System.out.println("Stack over");
        else
            stck[++tos]=item;
            
    }
    
    int pop() {
        if (tos < 0) {
            System.out.println("Stack null");
            return 0;
        }
        else
            return stck[tos--];
    }
}


public class TestStack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack mystck1 = new Stack();
        Stack mystck2 = new Stack();
        
        for(int i = 0; i < 10; i ++) {
            mystck1.push(i);
        }
        
        for(int i = 10; i < 20; i ++) {
            mystck2.push(i);
        }
        
        System.out.println("Stack 1");
        for(int i = 0; i < 10; i ++){
            System.out.println(mystck1.pop());
        }
        
        System.out.println("Stack 2");
        for(int i = 0; i < 10; i ++){
            System.out.println(mystck2.pop());
        }
        
    }
    
}
