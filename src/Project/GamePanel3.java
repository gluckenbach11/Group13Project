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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author gluck
 */
public class GamePanel3 extends JPanel implements ActionListener, MouseMotionListener, MouseListener
{
    int ballX = 150;
    int ballY = 30;
    int paddleX = 0;
    int gameSpeed = 1;
    int xDirection = 1;
    int yDirection = 1;
    Rectangle failZone;
    Rectangle playerBall;
    public int score = 0;
    boolean fail = false;
    Timer timer;
    
    GamePanel3()
    {
        setBackground(Color.RED);
        setVisible(true);
        addMouseMotionListener(this);  
        addMouseListener(this);
        timer = new Timer(10, this);
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        //draw the play area
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1200, 660);

        //draw the fail area
        g.setColor(Color.orange);
        g.fillRect(0, 660, 1200, 100);

        //draw the paddle
        g.setColor(Color.black);
        g.fillRect(paddleX, 500, 100, 20);

        //draw the ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 30, 30);
        
        //determine failure
        failZone = new Rectangle(0, 660, 1200, 100);
        playerBall = new Rectangle(ballX, ballY, 30, 30);
        
        if (playerBall.intersects(failZone))
        {
            fail = true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (ballX >= paddleX && ballX <= (paddleX + 100) && ballY >= 475) 
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
                this.gameSpeed = 10;
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
    public void mouseClicked(MouseEvent e) 
    {
        timer.start();
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
        timer.stop();
    }
}
