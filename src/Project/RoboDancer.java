/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author gluck
 */
public class RoboDancer extends JButton
{
    public RoboDancer()
    {
        setVisible(true);
        setIcon(new ImageIcon("images/robodancer.gif"));
        setBounds(0, 0, 100, 100);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
}
