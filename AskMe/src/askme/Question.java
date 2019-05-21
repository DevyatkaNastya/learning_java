/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askme;
import java.util.Random;

/**
 *
 * @author Nastya
 */
public class Question implements SharedConstants {
    Random rand = new Random();
    
    int ask() {
        int prob = (int) (100* rand.nextDouble());
        
        if(prob < 30)
            return NO;
        else if(prob < 60)
            return YES;
        else if(prob < 75)
            return LATER;
        else if(prob < 98)
            return SOON;
        else return NEVER;
    }
}
