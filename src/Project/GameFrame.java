/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.*;

/**
 *
 * @author gluck
 */
public class GameFrame extends JFrame
{
    GameFrame()
    {
        super("Group 13");
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SplashPanel sp = new SplashPanel();
        add(sp);
    }
}
