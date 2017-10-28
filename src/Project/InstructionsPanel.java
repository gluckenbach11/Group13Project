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
    InstructionsPanel()
    {
        JLabel title = new JLabel("Instructions");
        setBackground(Color.CYAN);
        setVisible(true);
        add(title);
    }
}
