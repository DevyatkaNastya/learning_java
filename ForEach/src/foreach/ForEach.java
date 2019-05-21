/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author Nastya
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for(int x: nums){
            sum+=x;
        }
        System.out.println(sum);
    }
    
}
