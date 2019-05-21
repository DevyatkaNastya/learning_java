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
public class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    
    FixedStack(int size) {
        stck = new int [size];
        tos = -1;
    }
    
    public void push (int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack over");
        else
            stck[++tos] = item;
    }
    
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is null");
            return 0;
        }
        else
            return stck[tos--];
    }
    
}
