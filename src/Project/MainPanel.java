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
    
    JButton optionB, startB;
    JPanel ops,start;
            
            
    MainPanel(JPanel options) {
        ops = options;
        
        setBackground(Color.blue);
        setVisible(true);
        
        optionB = new JButton("Options");
        add(optionB);
        optionB.addActionListener((this));
        
        startB = new JButton("Start");
        add(startB);
        startB.addActionListener((this));
    
    }
    
    public void actionPerformed(ActionEvent event){
        Object obj = event.getSource();
        
        
        if (obj == optionB){
            setVisible(false);
            ops.setVisible(true);
            repaint();
        }
        
        if(obj == startB){
            setVisible(false);
            start.setVisible(true);
            repaint();
        }
    }
    
}
