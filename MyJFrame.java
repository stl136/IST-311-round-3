
import javax.swing.JFrame;


public class MyJFrame extends JFrame
{
    public MyJFrame(){
        super("Stick Hero!");
        this.getContentPane();
        this.setSize(960, 640);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
