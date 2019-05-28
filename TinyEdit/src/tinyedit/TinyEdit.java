/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinyedit;
import java.io.*;

/**
 *
 * @author Nastya
 */
public class TinyEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str[] = new String[100];
        
        System.out.println("prtint string  or stop for break");
        
        for(int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        
        for(int i = 0; (!str[i].equals("stop")); i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
