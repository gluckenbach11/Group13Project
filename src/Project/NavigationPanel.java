package Project;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author gluck
 */
public class NavigationPanel extends JPanel
{
    int xx = 300;
    int yy = 300;
    Campus campus1 = new Campus(100, 100);
    Campus campus2 = new Campus(1000, 100);
    Campus campus3 = new Campus(100, 600);
    Campus campus4 = new Campus(1000, 600);
    Campus campus5 = new Campus(600, 400);
    Player player; 
    
    NavigationPanel()
    {
        player = new Player();
        setLayout(null);
        setVisible(true);
        setFocusable(true);
        add(campus1);
        add(campus2);
        add(campus3);
        add(campus4);
        add(campus5);
        player.setBounds(xx, yy, 100, 100);
        add(player);        
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g); 
        Image myImage = Toolkit.getDefaultToolkit().getImage("images/map.gif");
        g.drawImage(myImage, 0, 0, this);
        requestFocusInWindow();
    }
}
