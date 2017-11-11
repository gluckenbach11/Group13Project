/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author gluck
 */
public class GamePanel3 extends JPanel implements ActionListener, MouseMotionListener, KeyListener
{
    int ballX = 150;
    int ballY = 30;
    int paddleX = 0;
    int gameSpeed = 1;
    int xDirection = 1;
    int yDirection = 1;
    public int score = 0;
    
    GamePanel3()
    {
        setBackground(Color.RED);
        setVisible(true);
        addMouseMotionListener(this);
        Timer tt = new Timer(17, this);
        tt.start();

    }

    public void newball(int ballx, int bally) 
    {

        ballx = 150;
        bally = 30;
        return;
    }

    @Override
    protected void paintComponent(Graphics g) 
    {

        //draw the sky
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1200, 660);

        g.setColor(Color.GREEN);
        g.fillRect(0, 660, 1200, 100);

        //draw the paddel
        g.setColor(Color.black);
        g.fillRect(paddleX, 500, 100, 20);

        //draw the ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 30, 30);
        //score	
        
        // start && gameOver
        g.setColor(Color.white);
        g.setFont(new Font("Arial", 8, 50));

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (ballX >= paddleX && ballX <= paddleX + 100 && ballY >= 475) 
        {
            yDirection *= -1;
            score++;
        }

        if(ballX > 1170 || ballX < 0)
        {
            xDirection = xDirection * -1;                                         
        }      
        
        if(ballY > 660 || ballY < 0)
        {
            yDirection = yDirection * -1;
        }
        
        ballX = ballX + 1 * xDirection* gameSpeed;
        ballY = ballY + 1 * yDirection * gameSpeed;
        
        repaint();
    }
    
    public void setGameSpeed(String difficulty)
    {
        switch (difficulty)
        {
            case "slow":
                this.gameSpeed = 1;
                break;
            case "fast":
                this.gameSpeed = 20;
                break;
            default:
                this.gameSpeed = 3;
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        paddleX = e.getX() - 50;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e) 
    {

    }
}
