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
public class ScorePanel extends JPanel
{
    JLabel score1;
//    JLabel score2;
//    JLabel score3;
    XMLReadWriter xml;
    
    public ScorePanel()
    {
        String rundown1;
//        String rundown2;
//        String rundown3;
        JLabel title = new JLabel("Previous Play Through");
        score1 = new JLabel();
//        score2 = new JLabel();
//        score3 = new JLabel();
        xml = new XMLReadWriter();
        
        //read xml to local objects
        xml.openXMLReader();
        PlayerScore ps1 = (PlayerScore)xml.readXML();
//        PlayerScore ps2 = (PlayerScore)xml.readXML();
//        PlayerScore ps3 = (PlayerScore)xml.readXML();
        xml.closeXML();
        
        /**
         * translate local objects for user consumption
         * format labels with html for ease of implementation
         */
        rundown1 = "<html> Player Date: " + ps1.getDate() + "<br/>";
        rundown1 += "Total Play Time: " + ps1.getPlayTime() + "<br/>";
        rundown1 += "Game 1 Score: " + ps1.getGame1Score() + "<br/>";
        rundown1 += "Game 2 Score: " + ps1.getGame2Score() + "<br/>";
        rundown1 += "Game 3 Score: " + ps1.getGame3Score() + "<br/>";
        rundown1 += "Game 4 Score: " + ps1.getGame4Score() + "<br/>";
        rundown1 += "Game 5 Score: " + ps1.getGame5Score() + "</html>";
//        rundown2 = "<html> Player Name: " + ps2.getPlayerName() + "<br/>";
//        rundown2 += "Total Play Time: " + ps2.getPlayTime() + "<br/>";
//        rundown2 += "Game 1 Score: " + ps2.getGame1Score() + "<br/>";
//        rundown2 += "Game 2 Score: " + ps2.getGame2Score() + "<br/>";
//        rundown2 += "Game 3 Score: " + ps2.getGame3Score() + "<br/>";
//        rundown2 += "Game 4 Score: " + ps2.getGame4Score() + "<br/>";
//        rundown2 += "Game 5 Score: " + ps2.getGame5Score() + "</html>";
//        rundown3 = "<html> Player Name: " + ps3.getPlayerName() + "<br/>";
//        rundown3 += "Total Play Time: " + ps3.getPlayTime() + "<br/>";
//        rundown3 += "Game 1 Score: " + ps3.getGame1Score() + "<br/>";
//        rundown3 += "Game 2 Score: " + ps3.getGame2Score() + "<br/>";
//        rundown3 += "Game 3 Score: " + ps3.getGame3Score() + "<br/>";
//        rundown3 += "Game 4 Score: " + ps3.getGame4Score() + "<br/>";
//        rundown3 += "Game 5 Score: " + ps3.getGame5Score() + "</html>";
        
        //display attributes
        score1.setText(rundown1);
//        score2.setText(rundown2);
//        score3.setText(rundown3);
        title.setFont(new Font("SansSerif", Font.BOLD, 50));
        title.setForeground(Color.white);
        setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
        title.setBounds(50, 0, 700, 100);
        score1.setBounds(100, 100, 150, 150);
//        score2.setBounds(300, 100, 150, 150);
//        score3.setBounds(500, 100, 150, 150);
        score1.setBorder(BorderFactory.createTitledBorder(ps1.getPlayerName()));
//        score2.setBorder(BorderFactory.createTitledBorder("Score 2"));
//        score3.setBorder(BorderFactory.createTitledBorder("Score 3"));
        
        //add to panel
        add(title);
        add(score1);
//        add(score2);
//        add(score3);
    }
}
