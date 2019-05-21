/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo2;

/**
 *
 * @author Nastya
 */
public class StringDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;
        
        System.out.println("Length strOb1 = " + strOb1.length());
        System.out.println("Char 3 in strOb1 = " + strOb1.charAt(3));
        
        if(strOb1.equals(strOb2))
            System.out.println("strOb == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        
        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
    
}
