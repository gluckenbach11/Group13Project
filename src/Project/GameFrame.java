/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class GameFrame extends JFrame implements ActionListener
{
    
    Timer timer = new Timer(5000, this);
    Timer count = new Timer(1000, this);
    Timer gameTimer = new Timer(1000, this);
    int counter = 5;
    SplashPanel sp = new SplashPanel();
    OptionsPanel op = new OptionsPanel();
    MainPanel mp = new MainPanel(op);    
    
    GameFrame()
    {
        super("Group 13");
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sp = new SplashPanel();
        add(sp);
        timer.start();
        count.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object obj = e.getSource();
        if (obj == timer)
        {        
            System.out.println("timer");
            add(mp);
            sp.setVisible(false);
            mp.setVisible(true);
            timer.stop();
            count.stop();
        }
        
        if (obj == count)
        {
            if(counter > 0)
            {
                counter--;
            }            
            sp.lblCount.setText("Screen dismisses in " + counter + "...");
        }
    }
}
