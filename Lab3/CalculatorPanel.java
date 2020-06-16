package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculatorPanel extends JPanel {
    public JTextField input4 = new JTextField("", 5);
    public JTextField input3 = new JTextField("", 5);
    private SmallInteger arg1;
    private SmallInteger arg2;
    private JButton sum = new JButton("+");
    private JButton sub = new JButton("-");
    private JButton mul = new JButton("*");
    private JButton div = new JButton("/");
    private JButton mod = new JButton("mod");
    private JTextField input1 = new JTextField("", 5);
    private JLabel label1 = new JLabel("First argument");
    private JTextField input2 = new JTextField("", 5);
    private JLabel label2 = new JLabel("Second argument");

    public CalculatorPanel() {
        super();
        this.setLayout(new GridLayout(6, 0, 0, 0));
        input3.setEditable(false);
        input4.setEditable(false);
        ButtonGroup group = new ButtonGroup();
        group.add(sum);
        group.add(sub);
        group.add(mul);
        group.add(div);
        group.add(mod);
        this.add(label1);
        this.add(input1);
        this.add(label2);
        this.add(input2);
        this.add(sum);
        this.add(sub);
        this.add(mul);
        this.add(div);
        this.add(mod);
        this.add(input3);
        this.add(input4);
        sum.addActionListener(this::onSum);
        sub.addActionListener(this::onSub);
        mul.addActionListener(this::onMul);
        div.addActionListener(this::onDiv);
        mod.addActionListener(this::onMod);
    }

    private void onSum(ActionEvent event) {
        input4.setText("");
        try {
            arg1 = new SmallInteger(Integer.parseInt(input1.getText()));
            arg2 = new SmallInteger(Integer.parseInt(input2.getText()));
            if (arg1.number > 10000 || arg1.number < -10000 || arg2.number > 10000 || arg2.number < -10000) {
                input3.setText("");
                input4.setText("Bad range!");
            } else {
                if ((arg1.number + arg2.number) > 10000 || (arg1.number + arg2.number) < -10000) {
                    input3.setText("");
                    input4.setText("Out of range!");
                } else {
                    input3.setText(String.valueOf(arg1.add(arg2).number));
                }
            }
        } catch (NumberFormatException ignore) {
            input3.setText("");
            input4.setText("NaN");
        }
    }

    private void onSub(ActionEvent event) {
        input4.setText("");
        try {
            arg1 = new SmallInteger(Integer.parseInt(input1.getText()));
            arg2 = new SmallInteger(Integer.parseInt(input2.getText()));
            if (arg1.number > 10000 || arg1.number < -10000 || arg2.number > 10000 || arg2.number < -10000) {
                input3.setText("");
                input4.setText("Bad range!");
            } else {
                if ((arg1.number - arg2.number) > 10000 || (arg1.number - arg2.number) < -10000) {
                    input3.setText("");
                    input4.setText("Out of range!");
                } else {
                    input3.setText(String.valueOf(arg1.sub(arg2).number));
                }
            }
        } catch (NumberFormatException ignore) {
            input3.setText("");
            input4.setText("NaN");
        }
    }

    private void onMul(ActionEvent event) {
        input4.setText("");
        try {
            arg1 = new SmallInteger(Integer.parseInt(input1.getText()));
            arg2 = new SmallInteger(Integer.parseInt(input2.getText()));
            if (arg1.number > 10000 || arg1.number < -10000 || arg2.number > 10000 || arg2.number < -10000) {
                input3.setText("");
                input4.setText("Bad range!");
            } else {
                if ((arg1.number * arg2.number) > 10000 || (arg1.number * arg2.number) < -10000) {
                    input3.setText("");
                    input4.setText("Out of range!");
                } else {
                    input3.setText(String.valueOf(arg1.mul(arg2).number));
                }
            }
        } catch (NumberFormatException ignore) {
            input3.setText("");
            input4.setText("NaN");
        }
    }

    private void onDiv(ActionEvent event) {
        input4.setText("");
        try {
            arg1 = new SmallInteger(Integer.parseInt(input1.getText()));
            arg2 = new SmallInteger(Integer.parseInt(input2.getText()));
            if (arg1.number > 10000 || arg1.number < -10000 || arg2.number > 10000 || arg2.number < -10000) {
                input3.setText("");
                input4.setText("Bad range!");
            } else {
                if (arg2.number == 0) {
                    input3.setText("");
                    input4.setText("Division by Zero!");
                } else {
                    input3.setText(String.valueOf(arg1.div(arg2).number));
                }
            }
        } catch (NumberFormatException ignore) {
            input3.setText("");
            input4.setText("NaN");
        }
    }

    private void onMod(ActionEvent event) {
        input4.setText("");
        try {
            arg1 = new SmallInteger(Integer.parseInt(input1.getText()));
            arg2 = new SmallInteger(Integer.parseInt(input2.getText()));
            if (arg1.number > 10000 || arg1.number < -10000 || arg2.number > 10000 || arg2.number < -10000) {
                input3.setText("");
                input4.setText("Bad range!");
            } else {
                if (arg2.number == 0) {
                    input3.setText("");
                    input4.setText("Division by Zero!");
                } else {
                    input3.setText(String.valueOf(arg1.mod(arg2).number));
                }
            }
        } catch (NumberFormatException ignore) {
            input3.setText("");
            input4.setText("NaN");
        }
    }
}