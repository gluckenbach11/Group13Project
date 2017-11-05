/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    JPanel start;
    OptionsPanel ops;
    MenuBar mb;
    NavigationPanel np;
    OptionsPanel op;
    InstructionsPanel ip;
    BorderLayout layout;
    Rectangle playerRectangle;
    GamePanel1 gp1;
    GamePanel2 gp2;
    GamePanel3 gp3;
    GamePanel4 gp4;
    GamePanel5 gp5;
    int xx = 300;
    int yy = 300;
            
            
    MainPanel(OptionsPanel op) 
    {
        this.op = op;
        setBackground(Color.blue);
        setVisible(true);
        layout = new BorderLayout();
        setLayout(layout);        
        
        mb = new MenuBar();
        np = new NavigationPanel();
        ip = new InstructionsPanel();
        add(mb, "North");  
        add(np, "Center");
        mb.btnOptions.addActionListener((this));
        mb.btnBack.addActionListener((this));
        mb.btnInstructions.addActionListener((this));
        op.save.addActionListener((this));
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
                    np.campus1.setIcon(new ImageIcon("images/complete.png"));
                    gp1 = new GamePanel1();
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp1, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus2.getCampusRectangle()))
                {
                    np.campus2.setIcon(new ImageIcon("images/complete.png"));
                    gp2 = new GamePanel2();
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp2, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus3.getCampusRectangle()))
                {
                    np.campus3.setIcon(new ImageIcon("images/complete.png"));
                    gp3 = new GamePanel3();
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp3, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus4.getCampusRectangle()))
                {
                    np.campus4.setIcon(new ImageIcon("images/complete.png"));
                    gp4 = new GamePanel4();
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp4, "Center");
                    repaint();
                    revalidate();
                }
                else if (playerRectangle.intersects(np.campus5.getCampusRectangle()))
                {
                    np.campus5.setIcon(new ImageIcon("images/complete.png"));
                    gp5 = new GamePanel5();
                    remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    add(gp5, "Center");
                    repaint();
                    revalidate();
                }
            }            
        });        
    }
    
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
            setVisible(false);
            start.setVisible(true);
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
            
            mb.lblPlayer.setText("Hello, " + op.playerName);
            np.player.setPlayerIcon(op.playerSelection);            
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
