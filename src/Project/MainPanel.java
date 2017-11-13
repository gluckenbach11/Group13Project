package Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author gluck
 */
public class MainPanel extends JPanel implements ActionListener
{
    
    //JPanel start;
    OptionsPanel ops;
    MenuBar mb;
    NavigationPanel np;
    OptionsPanel op;
    InstructionsPanel ip;
    BorderLayout layout;
    Rectangle playerRectangle;
    int timerTick = 1000;
    GamePanel1 gp1;
    GamePanel2 gp2;
    GamePanel3 gp3;
    GamePanel4 gp4;
    GamePanel5 gp5;
    int xx = 300;
    int yy = 300;
    int game1Score;
    int game3Score;
    String difficulty;
            
            
    MainPanel(OptionsPanel op) 
    {
        this.op = op;
        setBackground(Color.blue);
        setVisible(true);
        layout = new BorderLayout();
        setLayout(layout);        
        //instantiate individual panels
        mb = new MenuBar();
        np = new NavigationPanel();
        ip = new InstructionsPanel();
        gp1 = new GamePanel1();
        gp2 = new GamePanel2();
        gp3 = new GamePanel3();
        gp4 = new GamePanel4();
        gp5 = new GamePanel5();
        //add initial panels

        add(mb, "North");  
        add(np, "Center");
        //apply listeners to appropriate components
        mb.btnOptions.addActionListener((this));
        mb.btnBack.addActionListener((this));
        mb.btnInstructions.addActionListener((this));
        op.save.addActionListener((this));
        gp1.cb.addActionListener((this));
        //set label text
        mb.lblPlayer.setText("Hello there!");        
          
        np.addKeyListener(new KeyAdapter()
        {            
            @Override
            public void keyPressed(KeyEvent ke) 
            {        
                int kk = ke.getKeyCode();
                if(kk == KeyEvent.VK_SPACE) {}
                if(kk == KeyEvent.VK_LEFT) {xx -= 25;}
                if(kk == KeyEvent.VK_RIGHT) {xx += 25;}
                if(kk == KeyEvent.VK_UP) {yy -= 25;}    
                if(kk == KeyEvent.VK_DOWN) {yy += 25;}
                playerRectangle = np.player.getBounds();
                np.player.setBounds(new Rectangle(xx, yy, 100, 100));
                repaint();
                //check for intersection between player piece and campuses
                if (playerRectangle.intersects(np.campus1.getCampusRectangle()))
                {                    
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp1, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus2.getCampusRectangle()))
                {
                    np.campus2.setIcon(new ImageIcon("images/complete.png"));
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp2, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus3.getCampusRectangle()))
                {
                    np.campus3.setIcon(new ImageIcon("images/complete.png"));
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp3, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus4.getCampusRectangle()))
                {
                    np.campus4.setIcon(new ImageIcon("images/complete.png"));
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp4, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus5.getCampusRectangle()))
                {
                    np.campus5.setIcon(new ImageIcon("images/complete.png"));
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp5, "Center");
                    repaint();
                    revalidate();
                }
            } 
        });
        /**
         * Game Panel 1: check for at least 5 hits
         */
        gp1.cb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                game1Score++;
                if (game1Score >=5)
                {
                    np.campus1.setIcon(new ImageIcon("images/complete.png"));
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(np, "Center");
                    xx = 300;
                    yy = 300;
                    np.player.setBounds(new Rectangle(xx, yy, 100, 100));
                    repaint();
                    revalidate();
                }
            }            
        });
        /**
         * Game Panel 3: check if paddle missed the ball
         */
        gp3.timer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (gp3.fail == true)
                {
                    game3Score = gp3.score;
                    gp3.fail = false;
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(np, "Center");
                    xx = 300;
                    yy = 300;
                    np.player.setBounds(new Rectangle(xx, yy, 100, 100));
                    repaint();
                    revalidate();
                }
            }            
        });
        
        gp2.addKeyListener(new KeyAdapter()
        {            
            @Override
            public void keyPressed(KeyEvent e) 
            {        
                int kk = e.getKeyCode();
                if(kk == KeyEvent.VK_SPACE) {}
                if(kk == KeyEvent.VK_LEFT) {xx -= 25;}
                if(kk == KeyEvent.VK_RIGHT) {xx += 25;}
                if(kk == KeyEvent.VK_UP) {yy -= 25;}    
                if(kk == KeyEvent.VK_DOWN) {yy += 25;}
                playerRectangle = gp2.player.getBounds();
                gp2.player.setBounds(new Rectangle(xx, yy, 100, 100));
                repaint();
                
                //check for intersection between player piece and campuses
                if (playerRectangle.intersects(gp2.s1.getstarzRectangle()))
                {
                    gp2.s1.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s2.getstarzRectangle()))
                {
                    gp2.s2.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s3.getstarzRectangle()))
                {
                    gp2.s3.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s4.getstarzRectangle()))
                {
                    gp2.s4.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s5.getstarzRectangle()))
                {
                    gp2.s5.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s6.getstarzRectangle()))
                {
                    gp2.s6.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s7.getstarzRectangle()))
                {
                    gp2.s7.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s8.getstarzRectangle()))
                {
                    gp2.s8.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s9.getstarzRectangle()))
                {
                    gp2.s9.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp2.s10.getstarzRectangle()))
                {
                    gp2.s10.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
            }            

        });
        gp4.addKeyListener(new KeyAdapter()
        {            
            @Override
            public void keyPressed(KeyEvent e) 
            {        
                int kk = e.getKeyCode();
                if(kk == KeyEvent.VK_SPACE) {}
                if(kk == KeyEvent.VK_LEFT) {xx -= 25;}
                if(kk == KeyEvent.VK_RIGHT) {xx += 25;}
                if(kk == KeyEvent.VK_UP) {yy -= 25;}    
                if(kk == KeyEvent.VK_DOWN) {yy += 25;}
                playerRectangle = gp4.player.getBounds();
                gp4.player.setBounds(new Rectangle(xx, yy, 100, 100));
                repaint();
                
                //check for intersection between player piece and campuses
                if (playerRectangle.intersects(gp4.s1.getstarzRectangle()))
                {
                    gp4.s1.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp4.s2.getstarzRectangle()))
                {
                    gp4.s2.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp4.s3.getstarzRectangle()))
                {
                    gp4.s3.setIcon(new ImageIcon(""));
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(gp4.dS.getdarkStarRectangle())) 
                {
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(np, "Center");
                    repaint();
                    revalidate();
                }
            }            
        });      

    }    
    //menu bar actions
    public void actionPerformed(ActionEvent event)
    {
        Object obj = event.getSource();        
        
        if (obj == mb.btnOptions)
        {
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(op, "Center");
            op.nameEntry.setText(op.playerName);
            repaint();
            revalidate();
        }
        
        if(obj == mb.btnStart)
        {
            mb.count.setDelay(timerTick);
        }
        
        if (obj == mb.btnBack)
        {
            mb.lblPlayer.setText("Hello, " + op.nameEntry.getText());
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(np, "Center");
            xx = 300;
            yy = 300;
            np.player.setBounds(new Rectangle(xx, yy, 100, 100));
            repaint();
            revalidate();
        }
        
        if (obj == mb.btnInstructions)
        {
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(ip, "Center");
            repaint();
            revalidate();
        }
        
        if (obj == op.save)
        {
            op.playerName = op.nameEntry.getText();
            //set player icon    
            if (op.player1.isSelected())
            {
                op.playerSelection = 1;
            }
            else if (op.player2.isSelected())
            {
                op.playerSelection = 2;
            }
            else if (op.player3.isSelected())
            {
                op.playerSelection = 3;
            }
            //set game speed
            if (op.speed1.isSelected())
            {
                difficulty = "slow";
            }
            else if (op.speed2.isSelected())
            {
                difficulty = "normal";
            }
            else if (op.speed3.isSelected())
            {
                difficulty = "fast";
            }
            //set timer speed
            if (op.timer1.isSelected())
            {
                timerTick = 2000;
            }
            else if (op.timer2.isSelected())
            {
                timerTick = 1000;
            }
            else if (op.timer3.isSelected())
            {
                timerTick = 100;
            }
            
            mb.lblPlayer.setText("Hello, " + op.playerName);
            np.player.setPlayerIcon(op.playerSelection); 
            gp1.setGameSpeed(difficulty);
            gp3.setGameSpeed(difficulty);
            mb.count.setDelay(timerTick);
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(np, "Center");
            repaint();
            revalidate();
        }
    }    
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
    }
}
