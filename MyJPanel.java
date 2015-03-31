
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyJPanel extends JPanel implements KeyListener, ActionListener
{
    int x;
    int y;
    int i;
    Graphics g;
    
    public MyJPanel(){
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
    
        setFocusable(true);
        addKeyListener(this);
        
        setLayout(null);
        add(b1);
        add(b2);
        add(b3);
        add(c1);
    }
    
    

    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void paintComponent(Graphics g) 
    {
        super.paintComponents(g);
        x = 50;
        this.g = g;
        y = 420;
        g.setColor(Color.black);
        //g.drawLine(x, y, 50, 0);
        requestFocusInWindow();
        //g.fillRect(x, y, 30, 30);
            
    }
    
    
    public void keyPressed(KeyEvent e) 
    {
 
        int key = e.getKeyCode();
        
                if (key == KeyEvent.VK_SPACE)
                {
                    g = getGraphics();
                    g.setColor(Color.black);
                    g.drawLine(50, 420, 50, y);
                    
                    y = y + -5;
                    i++;
                    System.out.println(y);
                    System.out.println(i);
                }
    
    }

    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
                
                if (key == KeyEvent.VK_SPACE)
                {
                    x = x + (i*5);
                    g = getGraphics();
                    g.setColor(Color.black);
                    g.drawLine(50, 420, x, 420);
                    
                    
                    
                }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
