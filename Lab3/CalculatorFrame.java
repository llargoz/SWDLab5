package Lab3;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame {
    public CalculatorFrame()
    {
    JFrame frame = new JFrame("Small Integer Calculator");
    frame.setSize(285, 300);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new CalculatorPanel();
    frame.add(panel);
    frame.setVisible(true);
    }
}
