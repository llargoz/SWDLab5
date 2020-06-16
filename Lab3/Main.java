package Lab3;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorFrame();
            }
        });
    }
}
