/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showfileautoclose;
import java.io.*;

/**
 *
 * @author Nastya
 */
public class ShowFileAutoClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        if(args.length != 1) {
            System.out.println("Use ShowFile file");
            return;
        }
        
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char)i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("IOException error");
        }
        
    }
    
}
