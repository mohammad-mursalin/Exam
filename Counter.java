import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    public static void main(String[] args) {

        new Count();
    }
}

class Count extends JFrame implements ActionListener {

    JTextArea area;
    JButton button1, button2;
    JLabel label1, label2;

    Count () {

        area  = new JTextArea();
        area.setBounds(50,50,250,50);

        button1 = new JButton("Count characters");
        button1.setBounds(50,100,250,25);
        button2 = new JButton("Count words");
        button2.setBounds(50,150,250,25);

        label1 = new JLabel("Total characters");
        label1.setBounds(50,200,250,25);
        label2 = new JLabel("Total words");
        label2.setBounds(50,250,250,25);

        button1.addActionListener(this);
        button2.addActionListener(this);

        add(area);
        add(button1);
        add(button2);
        add(label1);
        add(label2);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public  void actionPerformed(ActionEvent ae) {

        String text = area.getText();

        int characters = text.length();
        int words;

        String[] word = text.split("\\s");
        words = word.length;

        if(ae.getSource() == button1)
            label1.setText("Total character " +characters);

        else
            label2.setText("Total words " +words);
    }
}
