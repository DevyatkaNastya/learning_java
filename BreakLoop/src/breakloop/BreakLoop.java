/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakloop;

/**
 *
 * @author Nastya
 */
public class BreakLoop {
    public static void main (String args[]) {
        outer: for (int i=0; i<3; i++) {
        System.out.print("Проход" + i + ":");
        for(int j=0; j<100; j++) {
            if(j==10) break outer; //выход из обоих циклов
            System.out.print(j + " ");
        }
        System.out.println("Эта строка не будет выводиться");
    }
    System.out.println("Циклы завершены.");
}}
