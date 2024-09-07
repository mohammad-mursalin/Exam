import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringWordCounterGUI extends JFrame {
    private JTextArea inputTextArea;
    private JButton countCharsButton, countWordsButton;
    private JLabel charCountLabel, wordCountLabel;

    public StringWordCounterGUI() {
        // Create the frame
        setTitle("String and Word Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        inputTextArea = new JTextArea(5, 30);
        countCharsButton = new JButton("Count Characters");
        countWordsButton = new JButton("Count Words");
        charCountLabel = new JLabel("Character Count: ");
        wordCountLabel = new JLabel("Word Count: ");

        // Create panels for better organization
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JScrollPane(inputTextArea));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(countCharsButton);
        buttonPanel.add(countWordsButton);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(2, 1));
        resultPanel.add(charCountLabel);
        resultPanel.add(wordCountLabel);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(resultPanel, BorderLayout.SOUTH);

        // Add action listeners
        countCharsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextArea.getText();
                int charCount = inputText.length();
                charCountLabel.setText("Character Count: " + charCount);
            }
        });

        countWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextArea.getText().trim();
                if (inputText.isEmpty()) {
                    wordCountLabel.setText("Word Count: 0");
                } else {
                    String[] words = inputText.split("\\s+");
                    int wordCount = words.length;
                    wordCountLabel.setText("Word Count: " + wordCount);
                }
            }
        });

        // Add panel to frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StringWordCounterGUI());
    }
}

