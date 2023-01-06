package gui;

import javax.swing.*;
import java.awt.*;

public class First extends JFrame{
    private JPanel wrapper;
    private JPanel panelTop;
    private JPanel panelBottom;

    public First() {
        setContentPane(wrapper);
        setSize(800,600);
        setTitle("Hi First App");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/2-getWidth()/2,
                Toolkit.getDefaultToolkit().getScreenSize().height/2-getHeight()/2);
        setVisible(true);
    }

}
