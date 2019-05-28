/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brread;
import java.io.*;

/**
 *
 * @author Nastya
 */
public class BRRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("print char or press q");
        
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
    
}
