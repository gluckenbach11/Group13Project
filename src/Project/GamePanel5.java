/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class GamePanel5 extends JPanel implements ActionListener
{
    int x1 = 100;
    int y1 = -100;
    int x2 = 500;
    int y2 = -500;
    int x3 = 900;
    int y3 = -300;
    int gameSpeed = 2;
    RoboDancer rb1;
    RoboDancer rb2;
    RoboDancer rb3;
    JButton dangerZone;
    Timer fallTimer;
    int score;
    int misses;
    Boolean complete = false;
    
    GamePanel5()
    {
        super();
        setLayout(null);
        rb1 = new RoboDancer();
        rb2 = new RoboDancer();
        rb3 = new RoboDancer();
        dangerZone = new JButton("Click to Start");
        rb1.setBounds(x1, y1, 100, 100);
        rb2.setBounds(x2, y2, 100, 100);
        rb3.setBounds(x3, y3, 100, 100);
        dangerZone.setBounds(0, 700, 1200, 25);
        dangerZone.setBackground(Color.red);
        dangerZone.addActionListener((this));
        add(rb1);
        add(rb2);
        add(rb3);
        add(dangerZone);
        fallTimer = new Timer(100, this);
        
        rb1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                y1 = -100;
                rb1.setLocation(x1, y1);
                score++;
                repaint();  
            }            
        });
        
        rb2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                y2 = -500;
                rb2.setLocation(x2, y2);
                score++;
                repaint();  
            }            
        });
        
        rb3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                y3 = -300;
                rb1.setLocation(x3, y3);
                score++;
                repaint();  
            }            
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object obj = e.getSource();
        
        if(obj == fallTimer)
        {
            y1 += 5 * gameSpeed;
            y2 += 5 * gameSpeed;
            y3 += 5 * gameSpeed;
            rb1.setLocation(x1, y1);
            rb2.setLocation(x2, y2);
            rb3.setLocation(x3, y3);
            
            if (rb1.getBounds(new Rectangle()).intersects(dangerZone.getBounds(new Rectangle())))
            {
                y1 = -100;
                misses++;
            }
            if (rb2.getBounds(new Rectangle()).intersects(dangerZone.getBounds(new Rectangle())))
            {
                y2 = -500;
                misses++;
            }
            if (rb3.getBounds(new Rectangle()).intersects(dangerZone.getBounds(new Rectangle())))
            {
                y3 = -300;
                misses++;
            }
            //mark complete if more than 5 misses
            if(misses >= 5)
            {
                complete = true;
            }
            //cycle the colors
            setBackground(new Color(new Random().nextFloat(), new Random().nextFloat(), new Random().nextFloat()));
            dangerZone.setBackground(new Color(new Random().nextFloat(), new Random().nextFloat(), new Random().nextFloat()));
            repaint();
        }
        
        if(obj == dangerZone)
        {
            fallTimer.start();
            dangerZone.setText("Don't let them touch me!!");
        }
    }
}
