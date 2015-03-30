
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MyJFrame extends JFrame implements ActionListener, KeyListener
{
    JPanel mjp;
    //Building b1 = new Building();
    Timer tim;
    int i;
    int delay = 1000;
    public MyJFrame()
    {
       
        
        super("Stick Hero!");
        mjp = new JPanel();
        //mjp.add(b1);
        tim = new Timer(delay,  this);
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

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == tim){
            
        }
    }

    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
