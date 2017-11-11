package Project;


import java.awt.*;
import javax.swing.*;

public class starz extends JButton {
    
    starz(){
        
        setIcon(new ImageIcon("images/star.png"));
        setBounds(new Rectangle(0, 0, 128, 128));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    starz(int xx, int yy){
        
        setBounds(new Rectangle(xx, yy, 128, 128));
        setIcon(new ImageIcon("images/star.png"));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    public Rectangle getstarzRectangle(){
        
        return new Rectangle(getBounds());
    }
}
