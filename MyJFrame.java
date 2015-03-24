
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyJFrame extends JFrame
{
    JPanel mjp;
    //Building b1 = new Building();
    
    public MyJFrame()
    {
       
        
        super("Stick Hero!");
        mjp = new JPanel();
        //mjp.add(b1);
        JLabel b1 = new JLabel("  B1 ");
        b1.setOpaque(true);
        b1.setBackground(Color.red);
        b1.setBounds(0, 420, 50, 200);
        
        JLabel b2 = new JLabel("  B2");
        b2.setOpaque(true);
        b2.setBackground(Color.red);
        b2.setBounds(300, 420, 150, 200);
        
        JLabel b3 = new JLabel("  B3");
        b3.setOpaque(true);
        b3.setBackground(Color.red);
        b3.setBounds(600, 420, 90, 200);
        
        JLabel c1 = new JLabel();
        c1.setOpaque(true);
        c1.setBackground(Color.blue);
        c1.setBounds(0, 370, 10, 50);
        
        mjp.setLayout(null);
        mjp.add(b1);
        mjp.add(b2);
        mjp.add(b3);
        mjp.add(c1);
        
        add(mjp);
        
      
        this.getContentPane();
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
                
    }
    
}
