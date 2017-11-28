package Project;


import java.awt.*;
import javax.swing.*;

public class starz extends JButton {
    
    starz(){
        
        setIcon(new ImageIcon("images/star.png"));
        setBounds(new Rectangle(0, 0, 32, 32));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    starz(int xx, int yy){
        
        setBounds(new Rectangle(xx, yy, 32, 32));
        setIcon(new ImageIcon("images/star.png"));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    public Rectangle getstarzRectangle(){
        
        return new Rectangle(getBounds());
    }
    
    public Rectangle starzRekt(){
        
        return new Rectangle(0,0,0,0);
    }
}
