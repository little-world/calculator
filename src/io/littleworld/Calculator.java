package io.littleworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {


    JLabel display = new JLabel("display");

    public Calculator() {

        JButton button = new JButton("OK");
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);

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
        display.setText("clicked");
    }
}
