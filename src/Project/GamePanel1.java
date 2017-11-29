/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class GamePanel1 extends JPanel implements ActionListener, MouseListener
{
    Timer tmrButton;
    Timer tmrFlash;
    int time = 0;
    int score = 0;
    int btnX = 100;
    int xDirection = 1;
    int btnY = 300;
    int yDirection = 1;
    int gameSpeed = 3;
    JButton cb;
    JLabel lblScore;
    File boo;
    File whoo;
    Boolean complete = false;
    
    
    GamePanel1()
    {        
        super();        
        setLayout(null);
        setBackground(new Color(240, 240, 240));        
        cb = new JButton();
        cb.setIcon(new ImageIcon("images/mj.gif"));
        whoo = new File("sounds/whoo.wav");
        boo = new File("sounds/boo.wav");
        cb.setBounds(100, 300, 70, 116);
        cb.setOpaque(false);
        cb.setContentAreaFilled(false);
        cb.setBorderPainted(false);
        cb.setLocation(btnX, btnY);
        addMouseListener((this));
        add(cb);
        lblScore = new JLabel("Score: 0"); 
        lblScore.setForeground(Color.white);
        lblScore.setBounds(50, 50, 100, 25);
        add(lblScore);
        tmrButton = new Timer(10, this);  
        tmrFlash = new Timer(100, this);
        tmrButton.start();
        
        cb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                playSound(whoo);
                score++;
                lblScore.setText("Score: " + score);
                setBackground(Color.green);
                tmrFlash.start();
                repaint();  
            }            
        });
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        Object obj = ae.getSource();
        if (obj == tmrButton)
        {
            if(btnX > 1130 || btnX < 0)
            {
                xDirection = xDirection * -1;                                         
            }                   
            if(btnY > 620 || btnY < 0)
            {
                yDirection = yDirection * -1;
            }
            btnX = btnX + 1 * gameSpeed * xDirection;
            btnY = btnY + 1 * gameSpeed * yDirection;
            cb.setLocation(btnX, btnY);
        }
        
        if (obj == tmrFlash)
        {
            tmrFlash.stop();
            setBackground(new Color(240, 240, 240));
        }
    }
    
    public void setGameSpeed(String difficulty)
    {
        switch (difficulty)
        {
            case "slow":
                this.gameSpeed = 1;
                break;
            case "fast":
                this.gameSpeed = 10;
                break;
            default:
                this.gameSpeed = 3;
                break;
        }
    }
    
    public void playSound(File sound)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e)
        {
            //if sound fails, who cares?
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        Image myImage = Toolkit.getDefaultToolkit().getImage("images/stage.jpg");
        g.drawImage(myImage, 0, 0, this);
        requestFocusInWindow();
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
       playSound(boo);
       setBackground(Color.red);
       tmrFlash.start();
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
     
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        
    }
}
