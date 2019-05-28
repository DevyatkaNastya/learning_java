/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showfile;
import java.io.*;

/**
 *
 * @author Nastya
 */
public class ShowFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        FileInputStream fin = null;
        
        //file name is not empty
        if(args.length != 1) {
            System.out.println("Use ShowFile file");
            return;
        }
        
        try {
            fin = new FileInputStream(args[0]);
            
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error I/O " + e );
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException e) {
                System.out.println("Error by closing file");
            }
        }
    }
    
}
