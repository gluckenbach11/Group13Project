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
    int gameSpeed = 1;
    JButton save;
    JRadioButton player1;
    JRadioButton player2;
    JRadioButton player3;
    JRadioButton speed1;
    JRadioButton speed2;
    JRadioButton speed3;
    JRadioButton timer1;
    JRadioButton timer2;
    JRadioButton timer3;
    JPanel pnlPlayerSelection;
    JPanel pnlSpeedSelection;
    JPanel pnlTimerSelection;
    ButtonGroup bgPlayer;
    ButtonGroup bgSpeed;
    ButtonGroup bgTimer;
    
    OptionsPanel()
    {        
        super();
        save = new JButton("Save");
        JLabel title = new JLabel("Options");
        pnlPlayerSelection = new JPanel();
        pnlSpeedSelection = new JPanel();
        pnlTimerSelection = new JPanel();
        bgPlayer = new ButtonGroup();
        bgSpeed = new ButtonGroup();
        bgTimer = new ButtonGroup();
        player1 = new JRadioButton("Creepy Frank");
        player2 = new JRadioButton("Fowl on Dog");
        player3 = new JRadioButton("Unassuming Blip");
        speed1 = new JRadioButton("Grandma's Walker");
        speed2 = new JRadioButton("Normal");
        speed3 = new JRadioButton("Unreasonable");
        timer1 = new JRadioButton("Molasses IV Drip");
        timer2 = new JRadioButton("Normal");
        timer3 = new JRadioButton("Stupid Fast");        
        JLabel lblPlayer1 = new JLabel(new ImageIcon("images/player1.gif"));
        JLabel lblPlayer2 = new JLabel(new ImageIcon("images/player2.gif"));
        JLabel lblPlayer3 = new JLabel(new ImageIcon("images/player3.gif"));
        bgPlayer.add(player1);
        bgPlayer.add(player2);
        bgPlayer.add(player3);
        bgSpeed.add(speed1);
        bgSpeed.add(speed2);
        bgSpeed.add(speed3);
        bgTimer.add(timer1);
        bgTimer.add(timer2);
        bgTimer.add(timer3);        
        
        //place objects
        title.setBounds(450, 25, 500, 100);        
        nameEntry.setBounds(100, 200, 200, 40);
        pnlPlayerSelection.setBounds(100, 275, 700, 300);
        pnlSpeedSelection.setBounds(850, 275, 150, 125);
        pnlTimerSelection.setBounds(850, 450, 150, 125);
        save.setBounds(925, 600, 75, 35);
        
        //object attributes
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setForeground(Color.white);
        player1.setBackground(new Color(200, 100, 100));
        player2.setBackground(new Color(200, 100, 100));
        player3.setBackground(new Color(200, 100, 100));
        speed1.setBackground(new Color(200, 100, 100));
        speed2.setBackground(new Color(200, 100, 100));
        speed3.setBackground(new Color(200, 100, 100));
        timer1.setBackground(new Color(200, 100, 100));
        timer2.setBackground(new Color(200, 100, 100));
        timer3.setBackground(new Color(200, 100, 100));
        player1.setHorizontalAlignment(AbstractButton.CENTER);
        player2.setHorizontalAlignment(AbstractButton.CENTER);
        player3.setHorizontalAlignment(AbstractButton.CENTER);
        player1.setSelected(true);
        speed2.setSelected(true);
        timer2.setSelected(true);
        nameEntry.setBackground(new Color(200, 100, 100));
        nameEntry.setColumns(15);
        nameEntry.setText(playerName);  
        nameEntry.setBorder(BorderFactory.createTitledBorder("Enter Player Name"));
        pnlPlayerSelection.setBorder(BorderFactory.createTitledBorder("Select Player Piece"));
        pnlPlayerSelection.setLayout(new GridLayout(2, 3, 50, 10));
        pnlPlayerSelection.setBackground(new Color(200, 100, 100));
        pnlSpeedSelection.setBorder(BorderFactory.createTitledBorder("Select Game Speed"));
        pnlSpeedSelection.setLayout(new GridLayout(3, 1, 50, 10));
        pnlSpeedSelection.setBackground(new Color(200, 100, 100));
        pnlTimerSelection.setBorder(BorderFactory.createTitledBorder("Select Timer Speed"));
        pnlTimerSelection.setLayout(new GridLayout(3, 1, 50, 10));
        pnlTimerSelection.setBackground(new Color(200, 100, 100));
        
        //add objects to individual option panels
        pnlPlayerSelection.add(lblPlayer1);        
        pnlPlayerSelection.add(lblPlayer2);        
        pnlPlayerSelection.add(lblPlayer3);
        pnlPlayerSelection.add(player1);
        pnlPlayerSelection.add(player2);
        pnlPlayerSelection.add(player3);
        pnlSpeedSelection.add(speed1);
        pnlSpeedSelection.add(speed2);
        pnlSpeedSelection.add(speed3);
        pnlTimerSelection.add(timer1);
        pnlTimerSelection.add(timer2);
        pnlTimerSelection.add(timer3);
        
        //add panels to OptionPanel
        add(title);
        add(nameEntry);
        add(pnlPlayerSelection);
        add(pnlSpeedSelection);
        add(pnlTimerSelection);
        add(save);
        setLayout(null);
        setBackground(new Color(200, 100, 100));
        setVisible(true);        
    }    
}
