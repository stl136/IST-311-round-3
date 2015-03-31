
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MyJFrame extends JFrame
{
    MyJPanel mjp;

    
    public MyJFrame()
    {
       
        
        super("Stick Hero!");
        mjp = new MyJPanel();
        
        
      
        this.getContentPane().add(mjp);
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
                
    }

    
    
}
