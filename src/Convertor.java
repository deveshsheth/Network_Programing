import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convertor implements ActionListener {

    JTextField num1;
    JTextField convertedNumber;
    JButton submitButton = new JButton("Convert");

    public void frames()
    {
        JFrame frame = new JFrame("Text Fields");

        num1 = new JTextField(10);
        convertedNumber = new JTextField(10);
        convertedNumber.setEditable(false);


        JPanel inFieldPane = new JPanel();
        inFieldPane.setLayout(new GridLayout(2,2));

        inFieldPane.add(new JLabel("Enter Number"));
        inFieldPane.add(num1);
        num1.addActionListener(this);

        inFieldPane.add(new JLabel("Convertd In Binary Number"));
        inFieldPane.add(convertedNumber);
        convertedNumber.addActionListener(this);

        frame.add(inFieldPane, BorderLayout.NORTH);
        // Add submission button
        JPanel submitPane = new JPanel();
        submitPane.setLayout(new FlowLayout());
        submitPane.add(new JLabel("Convert Decimal to Binary"));
        submitButton.addActionListener(this);
        submitPane.add(submitButton);
        frame.add(submitPane,BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        // Display full name if and only if button was pushed
        if (e.getSource() == submitButton)
        {
            String fullString = num1.getText().trim();
            int convertedVal=Integer.parseInt(fullString);
            convertDecimalToBimnary(convertedVal);
        }
    }

    public void convertDecimalToBimnary(int convertedVal)
    {
        int i=1,remainder;
        String binary="";

        while (convertedVal!=0) {
            remainder=convertedVal%2;
            binary=remainder+binary;
            convertedVal=convertedVal/2;
        }
        //String s1=String.valueOf(binary);
        convertedNumber.setText(binary);

    }

    public static void main(String[] args) {
        Convertor c = new Convertor();
        c.frames();
    }

}
