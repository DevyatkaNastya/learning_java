/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stadyclass;

/**
 *
 * @author Nastya
 */
class Box {
    double width;
    double height;
    double depth;
}

//этот класс объявляет объект класса Box.

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        
        //присваивание значений переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        
        //вычисление объема параллелепипеда 
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
    
}
