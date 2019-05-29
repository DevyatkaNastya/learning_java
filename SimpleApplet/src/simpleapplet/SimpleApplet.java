/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleapplet;
import java.awt.*;
import java.applet.*;

/*
 <applet code="SimpleApplet" width=200 height=60>
</applet>
*/
public class SimpleApplet extends Applet {

    /**
     * @param args the command line arguments
     */
    
     public void paint(Graphics g){
         g.drawString("A Simple Applet", 20, 20);
     
    }
    
}
