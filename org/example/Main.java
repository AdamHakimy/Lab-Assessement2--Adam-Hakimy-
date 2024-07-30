package org.example;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() ->{
           JFrame frame = new JFrame("Calculator_AdamHakimy");
           frame.setContentPane(new Calculator().ba);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);
       });
}}