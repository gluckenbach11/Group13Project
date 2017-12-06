/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import javax.swing.*;
import java.awt.Font;

/**
 *
 * @author gluck
 */
public class SplashPanel extends JPanel 
{
  
    JLabel lblCount;
    int counter = 1;
    JLabel lblProgrammers = new JLabel("Those responsible:");
    JLabel programmer1 = new JLabel("Greg Luckenbach"); 
    JLabel programmer2 = new JLabel("Kelvin Sanchez");
    Font font = new Font("Jokerman",Font.BOLD,18);
    
    
    public SplashPanel()
    {        
        setVisible(true);
        setBackground(Color.GREEN);
        setLayout(null);
        JLabel title = new JLabel("PSU World Game!!",SwingConstants.CENTER);
        lblCount = new JLabel("Screen dismisses in " + counter + "...");        
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setBounds(350, 350, 500, 100);
        lblCount.setBounds(20, 700, 150, 20);
        lblProgrammers.setBounds(900, 600, 200, 20);
        programmer1.setBounds(900, 630, 200, 20);
        programmer2.setBounds(900, 660, 200, 20);
        title.setForeground(Color.white);
        add(title);
        add(lblProgrammers);
        programmer1.setFont(font);
        programmer2.setFont(font);
        add(programmer1);
        add(programmer2);
        add(lblCount);        
    }
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Image myImage = Toolkit.getDefaultToolkit().getImage("images/welcome.png");
        g.drawImage(myImage, 0, 0, this);
        requestFocusInWindow();
    }
}
