package Project;

import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author gluck
 */
public class GamePanel4 extends JPanel implements ActionListener{
    Timer tim;

    
    int xx = 300;
    int yy = 300;
    int score;
    int gameSpeed = 2000;
    Boolean complete = false;
    
    darkStar dS = new darkStar(130, 100);
    starz s1    = new starz(230  , 120);
    starz s2    = new starz(330  ,  80);
    starz s3    = new starz(130  ,  140);
    
    Player player;
    
    GamePanel4(){
        
        player = new Player();
        setBackground(Color.GREEN);
        setVisible(true);
        setLayout(null);
        player.setBounds(xx, yy, 100, 100);
        add(player); 
        
        add(dS);
        add(s1);
        add(s2);
        add(s3);
        
        tim = new Timer(gameSpeed,this);
        tim.start();
        
    }
     @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Image myImage = Toolkit.getDefaultToolkit().getImage("images/deathStar.png");
        g.drawImage(myImage, 0, 0, this);
        requestFocusInWindow();
    }
    
      public void actionPerformed(ActionEvent event){
        Object obj = event.getSource();
        
        if(obj == tim){
            int x = (int) (Math.random()*20);
            int y = (int) (Math.random()*20);
            int X = (int) (Math.random()*20);
            int Y = (int) (Math.random()*20);
            int j = (int) (Math.random()*20);
            int k = (int) (Math.random()*20);
            
            s1.setBounds(new Rectangle(60*x,30*y,32,32));
            s2.setBounds(new Rectangle(60*X,30*Y,32,32));
            s3.setBounds(new Rectangle(60*x,30*Y,32,32));
            dS.setBounds(new Rectangle(60*j,30*k,128,128));
        }
    }
    public void setGameSpeed(String difficulty){
        switch (difficulty){
            case "slow":
                this.gameSpeed = 4000;
                break;
            case "fast":
                this.gameSpeed = 500;
                break;
            default:
                this.gameSpeed = 2000;
                break;
        }
        tim.setDelay(gameSpeed);
    }
}
