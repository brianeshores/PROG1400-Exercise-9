import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout implements ActionListener {

    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;

    public Layout() {
        frame = new JFrame("Take a swing!");

        button1 = new JButton("Toggle Left");
        button1.setVisible(true);
        button1.setBounds(150, 0, 100, 40);
        button1.addActionListener(this);

        button2 = new JButton("Toggle Right");
        button2.setVisible(true);
        button2.setBounds(550, 0, 100, 40);
        button2.addActionListener(this);

        JLabel label1 = new JLabel("This is the left panel");
        label1.setVisible(true);
        label1.setForeground(Color.red);
        label1.setFont(new Font("roboto", Font.PLAIN, 20));

        JLabel label2 = new JLabel("This is the right panel");
        label2.setVisible(true);
        label2.setForeground(Color.blue);
        label2.setFont(new Font("roboto", Font.PLAIN, 20));


        panel1 = new JPanel();
        panel1.setVisible(true);
        panel1.setBounds(0, 40, 400, 360);
        panel1.setBackground(Color.blue);
        panel1.add(label1);

        panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setBounds(400, 40, 400, 360);
        panel2.setBackground(Color.red);
        panel2.add(label2);

        this.frame.add(button1);
        this.frame.add(button2);
        this.frame.add(panel1);
        this.frame.add(panel2);
        this.frame.setLayout(null);
        this.frame.setSize(800, 400);
        this.frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        toggleVisible(e);
    }

    public void toggleVisible(ActionEvent e) {
        if(e.getSource() == button1) {
            this.panel1.setVisible(!this.panel1.isVisible());
        } else if (e.getSource() == button2) {
            this.panel2.setVisible(!this.panel2.isVisible());
        }
    }
}
