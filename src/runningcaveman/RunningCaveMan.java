/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningcaveman;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Timer;

/**
 *
 * @author Eric
 */
public class RunningCaveMan {

    GUI gui;
    
    public RunningCaveMan(GUI x){
        gui = x;
    }
    
    public void setImageTre() throws InterruptedException {
       
        for (int i = 0; i < 12; i++) {
            
         String ny = "./bild/" + (i+1) + ".png";
         gui.setMinIcon(ny);
         
         try{
             Thread.sleep(100);
         }catch (InterruptedException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
}
}