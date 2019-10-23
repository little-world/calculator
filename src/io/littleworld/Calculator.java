package io.littleworld;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    JButton button = new JButton("OK");
    JLabel display = new JLabel("display");

    public Calculator() {
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(display, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();
        calculator.setSize(400, 400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
