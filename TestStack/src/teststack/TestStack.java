/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack;

/**
 *
 * @author Nastya
 */

class Stack {
    int stck[] = new int [10];
    int tos;
    
    Stack() {
        tos = -1;
    }
    
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack over");
        }
        stck[++tos]=item;
    }
    
    int pop () {
        if (tos < 0) {
            System.out.println("Stack null");
            return 0;
        }
        return stck[tos--];
    }
}

public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        for(int i = 0; i < 10; i++)
            mystack1.push(i);
        
        for(int i = 10; i < 20; i++)
            mystack2.push(i);
        
        System.out.println("Stack1:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        
        System.out.println();
        System.out.println("Stack2:");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
    
}
