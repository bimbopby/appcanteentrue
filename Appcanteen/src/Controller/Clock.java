/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class Clock extends Thread{
    private JLabel lb1;

    public Clock(JLabel lb1) {
        this.lb1 = lb1;
    }
    
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st = sdf.format(now);
            
            lb1.setText(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
        
    }
}
