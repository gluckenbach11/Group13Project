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
    JButton btnScores;
    JLabel lblPlayer;
    JLabel timer;
    Timer count;
    int time = 0;
    double timerMultiplier;
    int timerTick = 1000;
    
    MenuBar()
    {
        super();
        setVisible(true);
        setBackground(new Color(75, 200, 160));
        btnBack = new JButton("Back");
        btnStart = new JButton("Start");
        btnOptions = new JButton("Options");
        btnInstructions = new JButton("Instructions");
        btnScores = new JButton("Scores");
        lblPlayer = new JLabel();
        timer = new JLabel("Click Start to Begin >>>");
        timerMultiplier = 1.0;
        timerTick = 1000;
        
        count = new Timer((int)(timerTick), new ActionListener()
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
                count.setDelay(timerTick);
                count.start();
            }        
        });       
        
        //add components
        add(timer);        
        add(btnStart);        
        add(btnInstructions);
        add(btnOptions);
        add(btnScores);
        add(btnBack);
        add(lblPlayer);
    }
}
