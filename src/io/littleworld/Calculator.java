package io.littleworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {


    JLabel display = new JLabel("display");

    public Calculator() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);

        for(int i = 0; i< 16; i++) {
            JButton button = new JButton("" + i);
            panel.add(button);
            button.addActionListener(this);
        }

        getContentPane().add(display, BorderLayout.NORTH);


    }

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        calculator.setSize(400, 400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(e.getActionCommand());
    }
}
