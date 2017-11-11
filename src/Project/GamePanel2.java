package Project;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

/**
 *
 * gluck
 */
public class GamePanel2 extends JPanel{
    
    
    int xx = 300;
    int yy = 300;
    // Create Stars and their locations
    starz s1  = new starz(130  , 100);
    starz s2  = new starz(230  , 120);
    starz s3  = new starz(330  ,  80);
    starz s4  = new starz(430  , 140);
    starz s5  = new starz(530  ,  60);
    starz s6  = new starz(630  , 160);
    starz s7  = new starz(730  ,  40);
    starz s8  = new starz(830  , 180);
    starz s9  = new starz(930  ,  20);
    starz s10 = new starz(1030 , 200);
    Player player;
    
    
    GamePanel2(){
        
        player = new Player();
        setLayout(null);
        setVisible(true);
        setFocusable(true); 
        player.setBounds(xx, yy, 100, 100);
        add(player);  

        //add stars to panel
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        add(s6);
        add(s7);
        add(s8);
        add(s9);
        add(s10);
        
    }
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Image myImage = Toolkit.getDefaultToolkit().getImage("images/night.jpg");
        g.drawImage(myImage, 0, 0, this);
        requestFocusInWindow();
    }
}
