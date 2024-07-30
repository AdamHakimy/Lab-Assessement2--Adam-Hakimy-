package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Calculator {
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton button6;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton enterButton;
    private JButton BackButton;

    public JPanel ba;
    private JFormattedTextField formattedTextField1;
    private JButton clearButton;
    private JButton cosButton;
    private JButton sinButton;
    private JButton tanButton;
    private JButton sqrtButton;
    private JButton button4;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    double a,b,result;
    String op;
    public Calculator(){


        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a0Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a6Button.getText());

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText()+ a9Button.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(formattedTextField1.getText());
                op="+";
                formattedTextField1.setText("");

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(formattedTextField1.getText());
                op="-";
                formattedTextField1.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(formattedTextField1.getText());
                op="*";
                formattedTextField1.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(formattedTextField1.getText());
                op="/";
                formattedTextField1.setText("");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Original = formattedTextField1.getText();

                String CText = "";
                formattedTextField1.setText(CText);
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double value = Double.parseDouble((formattedTextField1.getText()));
                if(value>=0){
                    double result =Math.cos(value);
                    formattedTextField1.setText(String.valueOf(result));
                }else{
                    formattedTextField1.setText("Error!");
                }
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double value = Double.parseDouble((formattedTextField1.getText()));
                if(value>=0){
                    double result =Math.sin(value);
                    formattedTextField1.setText(String.valueOf(result));
                }else{
                    formattedTextField1.setText("Error!");
                }
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double value = Double.parseDouble((formattedTextField1.getText()));
                if(value>=0){
                    double result =Math.tan(value);
                    formattedTextField1.setText(String.valueOf(result));
                }else{
                    formattedTextField1.setText("Error!");
                }
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble((formattedTextField1.getText()));
                if(value>=0){
                    double result =Math.sqrt(value);
                    formattedTextField1.setText(String.valueOf(result));
                }else{
                    formattedTextField1.setText("Error!");
                }
            }
        });


        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Backspace = null;
                if(formattedTextField1.getText().length()>0){
                    StringBuilder StrB = new StringBuilder(formattedTextField1.getText());
                    StrB.deleteCharAt(formattedTextField1.getText().length()-1);
                    Backspace=String.valueOf(StrB);
                    formattedTextField1.setText(Backspace);
                }
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(formattedTextField1.getText());

                if(op =="+"){
                    result=a+b;
                    formattedTextField1.setText(String.valueOf(result));
                } else if (op == "-") {
                    result=a-b;
                    formattedTextField1.setText(String.valueOf(result));

                }else if (op == "/") {
                    if(b==0){
                        formattedTextField1.setText("Can't divide number by zero");
                    }else {
                    result=a/b;
                    formattedTextField1.setText(String.valueOf(result));}

                }else if (op == "*") {
                    result=a*b;
                    formattedTextField1.setText(String.valueOf(result));

                } else if (op == "%") {

                    if(b==0){
                        formattedTextField1.setText("Error!");
                    }else {
                        result=a%b;
                        formattedTextField1.setText(String.valueOf(result));}

                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(formattedTextField1.getText());
                op="%";
                formattedTextField1.setText("");

            }
        });
    }
}



