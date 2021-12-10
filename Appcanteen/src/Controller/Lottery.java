/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Lottery extends Thread{
    private JTextField txt;

    public Lottery(JTextField txt) {
        this.txt = txt;
    }
    
    public void run(){
        Date now = new Date();
        Random rd = new Random(now.getTime());
        for (int i = 0; i < 1000; i++) {
         
                int num = Math.abs( rd.nextInt() % 10);
                txt.setText("" + num);
           
                try {  
                Thread.sleep(2);
            } catch (InterruptedException ex) {}
        }
    }
            
}
