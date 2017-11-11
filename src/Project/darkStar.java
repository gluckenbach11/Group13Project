package Project;

/**
 *
 * @author Kelvin Sanchez
 */
import java.awt.*;
import javax.swing.*;

public class darkStar extends JButton {
    darkStar(){
        
        setIcon(new ImageIcon("images/starX.png"));
        setBounds(new Rectangle(0, 0, 128, 128));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    darkStar(int xx, int yy){
        
        setBounds(new Rectangle(xx, yy, 128, 128));
        setIcon(new ImageIcon("images/starX.png"));
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
    
    public Rectangle getdarkStarRectangle(){
        
        return new Rectangle(getBounds());
    }
}
