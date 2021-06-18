package project;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class importsUsed extends JFrame{
    private JLabel item1;
    public importsUsed(){
        super("The title");
        setLayout(new FlowLayout());
        item1 = new JLabel("This is a label");
        item1.setToolTipText("This shows on hover");
        add(item1);
    }
}
