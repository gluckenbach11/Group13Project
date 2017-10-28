/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author gluck
 */
public class OptionsPanel extends JPanel
{
    String playerName;
    JTextField nameEntry = new JTextField();
    
    OptionsPanel()
    {
        JLabel title = new JLabel("Options");
        nameEntry.setColumns(15);
        nameEntry.setBorder(BorderFactory.createTitledBorder("Enter Player Name") );
        add(title);
        add(nameEntry);
        setBackground(Color.magenta);
        setVisible(true);
    }
    
}
