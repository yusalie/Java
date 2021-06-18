package project;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class importsUsed extends JFrame{
    private JLabel item1;
    public importsUsed(){
        super("The title");
        setLayout(new FlowLayout());
        item1 = new JLabel("This is a label");
        JButton btn = new JButton("click me");
        btn.setBounds(50, 50, 50, 50);
        add(item1);
        add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                item1.setText("You clicked the button");
            }
        });
    }
}
