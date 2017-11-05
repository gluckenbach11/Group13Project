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
public class Campus extends JButton
{
    Campus()
    {
        setIcon(new ImageIcon("images/campus.png"));
        setBounds(new Rectangle(0, 0, 72, 72));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    Campus(int xx, int yy)
    {
        setBounds(new Rectangle(xx, yy, 72, 72));
        setIcon(new ImageIcon("images/campus.png"));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    public Rectangle getCampusRectangle()
    {
        return new Rectangle(getBounds());
    }
    
}
