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
        mb.lblPlayer.setText("Hello there!");
    }
    
    public void actionPerformed(ActionEvent event){
        Object obj = event.getSource();
        
        
        if (obj == mb.btnOptions){
            op = new OptionsPanel();
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(op, "Center");
            repaint();
            revalidate();
        }
        
        if(obj == mb.btnStart){
            setVisible(false);
            start.setVisible(true);
        }
        
        if (obj == mb.btnBack)
        {
            mb.lblPlayer.setText("Hello " + op.nameEntry.getText());
            remove(layout.getLayoutComponent(BorderLayout.CENTER));
            add(np, "Center");
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
    }
    
}
