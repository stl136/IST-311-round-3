
import java.awt.Color;
import javax.swing.JLabel;

public class Building extends JLabel
{
    int[] buildingWidth;
    int[] buildingDistance;
    int x = 200;
    
    public Building()
    {
        super();
        this.setBackground(Color.red);
        this.setSize(300, x);
        
              
    }
}
