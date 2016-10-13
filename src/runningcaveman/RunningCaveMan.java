/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningcaveman;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Eric
 */
public class RunningCaveMan {

    GUI gui;

    public RunningCaveMan(GUI x) {
        gui = x;
    }

    public void setImageTre(int speed) throws InterruptedException {
        int movement = speed;

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 12; i++) {
                String ny = "./bild/" + (i + 1) + ".png";
                gui.setMinIcon(ny);

                TimeUnit.MILLISECONDS.sleep(movement);

            }
        }
    }

}
