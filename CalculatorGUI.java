import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    public CalculatorGUI() {
        // Create the frame
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");

        // Create panels for better organization
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);

        // Add action listeners
        addButton.addActionListener(new OperationListener());
        subButton.addActionListener(new OperationListener());
        mulButton.addActionListener(new OperationListener());
        divButton.addActionListener(new OperationListener());

        // Add panel to frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    private class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                if (e.getSource() == addButton) {
                    result = num1 + num2;
                } else if (e.getSource() == subButton) {
                    result = num1 - num2;
                } else if (e.getSource() == mulButton) {
                    result = num1 * num2;
                } else if (e.getSource() == divButton) {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI());
    }
}

