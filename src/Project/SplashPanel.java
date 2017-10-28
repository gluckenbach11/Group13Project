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
public class SplashPanel extends JPanel 
{
    SplashPanel()
    {
        setVisible(true);
        setBackground(Color.red);
        JLabel title = new JLabel("Gamey Game");
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setBounds(400, 300, WIDTH, HEIGHT);
        title.setForeground(Color.white);
        add(title);
    }
}
