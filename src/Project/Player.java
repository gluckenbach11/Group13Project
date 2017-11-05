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
public class Player extends JButton
{
    Player()
    {
        setIcon(new ImageIcon("images/player1.gif"));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    public void setPlayerIcon(int playerChoice)
    {
        switch (playerChoice)
        {
                case 2:
                    setIcon(new ImageIcon("images/player2.gif"));
                    break;
                case 3:
                    setIcon(new ImageIcon("images/player3.gif"));
                    break;
                default:
                    setIcon(new ImageIcon("images/player1.gif"));
                    break;
        }
    }
}
