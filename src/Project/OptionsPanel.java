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
public class OptionsPanel extends JPanel
{
    String playerName = "Player 1";
    JTextField nameEntry = new JTextField();
    int playerSelection = 0;
    JButton save;
    JRadioButton player1;
    JRadioButton player2;
    JRadioButton player3;
    JPanel pnlButtons;
    
    OptionsPanel()
    {        
        save = new JButton("Save");
        JLabel title = new JLabel("Options");
        pnlButtons = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        player1 = new JRadioButton("Creepy Frank");
        player2 = new JRadioButton("Fowl on Dog");
        player3 = new JRadioButton("Unassuming Blip");
        JLabel lblPlayer1 = new JLabel(new ImageIcon("images/player1.gif"));
        JLabel lblPlayer2 = new JLabel(new ImageIcon("images/player2.gif"));
        JLabel lblPlayer3 = new JLabel(new ImageIcon("images/player3.gif"));
        bg.add(player1);
        bg.add(player2);
        bg.add(player3);
        
        
        //place objects
        title.setBounds(450, 25, 500, 100);        
        nameEntry.setBounds(100, 200, 200, 40);
        pnlButtons.setBounds(100, 275, 700, 300);
        save.setBounds(725, 600, 75, 35);
        
        //object attributes
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setForeground(Color.white);
        player1.setBackground(Color.magenta);
        player2.setBackground(Color.magenta);
        player3.setBackground(Color.magenta);
        player1.setHorizontalAlignment(AbstractButton.CENTER);
        player2.setHorizontalAlignment(AbstractButton.CENTER);
        player3.setHorizontalAlignment(AbstractButton.CENTER);
        player1.setSelected(true);
        nameEntry.setBackground(Color.magenta);
        nameEntry.setColumns(15);
        nameEntry.setText(playerName);        
        nameEntry.setBorder(BorderFactory.createTitledBorder("Enter Player Name"));
        pnlButtons.setBorder(BorderFactory.createTitledBorder("Select Player Piece"));
        pnlButtons.setLayout(new GridLayout(2, 3, 50, 10));
        pnlButtons.setBackground(Color.magenta);
        
        //add objects to panel
        pnlButtons.add(lblPlayer1);        
        pnlButtons.add(lblPlayer2);        
        pnlButtons.add(lblPlayer3);
        pnlButtons.add(player1);
        pnlButtons.add(player2);
        pnlButtons.add(player3);
        add(title);
        add(nameEntry);
        add(pnlButtons);
        add(save);
        setLayout(null);
        setBackground(Color.magenta);
        setVisible(true);        
    }    
}
