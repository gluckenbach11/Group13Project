/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class InstructionsPanel extends JPanel
{
    JButton Erie;
    JButton w0rld;
    JButton Beaver;
    JButton DuBois;
    JButton Lehigh;
    
    InstructionsPanel()
    {
        JLabel title = new JLabel("    Instructions");
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setForeground(Color.white);
        setBackground(Color.CYAN);
        setLayout(new GridLayout(2,5));
        setVisible(true);
        
        
        Erie = new JButton("<html><p><b>Erie Campus</b></p><br />Touch Micheal as many times as you can. 5 misses and you lose.</html>");
        w0rld = new JButton("<html><p>World Campus</p><br />Grab the stars as fast as you can!</html>");
        Beaver = new JButton("<html><p>Beaver Campus</p><br />Don't let the disco robots land on Earth! 5 misses and you lose.</html>");
        DuBois = new JButton("<html><p>DuBois Campus</p><br />Paddle and Ball, what else is there to say? Don't miss.</html>");
        Lehigh = new JButton("<html><p>Lehigh Campus</p><br />Avoid the Death Star, but save the little ones!</html>");
        
        add(Erie);
        add(title);
        add(w0rld);        
        add(DuBois);
        add(Beaver);
        add(Lehigh);        
    }
}
