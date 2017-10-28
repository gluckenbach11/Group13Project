/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class MenuBar extends JPanel 
{
    JButton btnBack;
    JButton btnStart;
    JButton btnOptions;
    JButton btnInstructions;
    JLabel lblPlayer;
    JLabel timer;
    int time = 0;
    
    MenuBar()
    {
        setVisible(true);
        setBackground(Color.magenta);
        btnBack = new JButton("Back");
        btnStart = new JButton("Start");
        btnOptions = new JButton("Options");
        btnInstructions = new JButton("Instructions");
        lblPlayer = new JLabel();
        timer = new JLabel("Time: Click Start to Begin >>>");
        
        Timer count = new Timer(1000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                time++;
                timer.setText("Time: " + time);
            }        
        });
        
        btnStart.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                count.start();
            }        
        });
        
        
        add(timer);        
        add(btnStart);        
        add(btnInstructions);
        add(btnOptions);
        add(btnBack);
        add(lblPlayer);
    }
}
