package ru.mirea.prac15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class window  extends JFrame implements WindowListener, ActionListener {
    private TextField textField = new TextField();
    private JButton button_9 = new JButton("9");
    private JButton button_8 = new JButton("8");
    private JButton button_7 = new JButton("7");
    private JButton button_div = new JButton("/");
    private JButton button_4 = new JButton("4");
    private JButton button_5 = new JButton("5");
    private JButton button_6 = new JButton("6");
    private JButton button_1 = new JButton("1");
    private JButton button_2 = new JButton("2");
    private JButton button_3 = new JButton("3");
    private JButton button_mux = new JButton("*");
    private JButton button_difference = new JButton("-");
    private JButton button_0 = new JButton("0");
    private JButton button_point = new JButton(".");
    private JButton button_equally = new JButton("=");
    private JButton button_summ = new JButton("+");

    private String text = "";
    private double number_1  = 0;
    private double number_2  = 0;
    private char i;
    NumberFormat numberFormat = new DecimalFormat("#.######");
    public window(){

        Font font = new Font("Impact", Font.BOLD, 40);
        Font font_for_buttons = new Font("Times new Roman", Font.PLAIN, 20);

        setLayout(null);
        setSize(400, 320);
        setVisible(true);
        setLocation(700, 250);
        textField.setLocation(25, 25);
        textField.setFont(font);
        textField.setSize(350, 50);
        textField.setVisible(true);
        add(textField);

        button_div.setFont(font_for_buttons);
        button_div.setSize(60,20);
        button_div.setLocation(300, 100);
        button_div.setVisible(true);
        add(button_div);
        button_div.addActionListener(this);

        button_9.setFont(font_for_buttons);
        button_9.setSize(60,20);
        button_9.setLocation(210, 100);
        button_9.setVisible(true);
        add(button_9);
        button_9.addActionListener(this);

        button_8.setFont(font_for_buttons);
        button_8.setSize(60,20);
        button_8.setLocation(120, 100);
        button_8.setVisible(true);
        add(button_8);
        button_8.addActionListener(this);

        button_7.setFont(font_for_buttons);
        button_7.setSize(60,20);
        button_7.setLocation(30, 100);
        button_7.setVisible(true);
        add(button_7);
        button_7.addActionListener(this);

        button_4.setFont(font_for_buttons);
        button_4.setSize(60,20);
        button_4.setLocation(30, 150);
        button_4.setVisible(true);
        add(button_4);
        button_4.addActionListener(this);

        button_5.setFont(font_for_buttons);
        button_5.setSize(60,20);
        button_5.setLocation(120, 150);
        button_5.setVisible(true);
        add(button_5);
        button_5.addActionListener(this);

        button_6.setFont(font_for_buttons);
        button_6.setSize(60,20);
        button_6.setLocation(210, 150);
        button_6.setVisible(true);
        add(button_6);
        button_6.addActionListener(this);

        button_mux.setFont(font_for_buttons);
        button_mux.setSize(60,20);
        button_mux.setLocation(300, 150);
        button_mux.setVisible(true);
        add(button_mux);
        button_mux.addActionListener(this);

        button_1.setFont(font_for_buttons);
        button_1.setSize(60,20);
        button_1.setLocation(30, 200);
        button_1.setVisible(true);
        add(button_1);
        button_1.addActionListener(this);

        button_2.setFont(font_for_buttons);
        button_2.setSize(60,20);
        button_2.setLocation(120, 200);
        button_2.setVisible(true);
        add(button_2);
        button_2.addActionListener(this);

        button_3.setFont(font_for_buttons);
        button_3.setSize(60,20);
        button_3.setLocation(210, 200);
        button_3.setVisible(true);
        add(button_3);
        button_3.addActionListener(this);

        button_difference.setFont(font_for_buttons);
        button_difference.setSize(60,20);
        button_difference.setLocation(300, 200);
        button_difference.setVisible(true);
        add(button_difference);
        button_difference.addActionListener(this);

        button_0.setFont(font_for_buttons);
        button_0.setSize(60,20);
        button_0.setLocation(30, 250);
        button_0.setVisible(true);
        add(button_0);
        button_0.addActionListener(this);

        button_point.setFont(font_for_buttons);
        button_point.setSize(60,20);
        button_point.setLocation(120, 250);
        button_point.setVisible(true);
        add(button_point);
        button_point.addActionListener(this);

        button_equally.setFont(font_for_buttons);
        button_equally.setSize(60,20);
        button_equally.setLocation(210, 250);
        button_equally.setVisible(true);
        add(button_equally);
        button_equally.addActionListener(this);

        button_summ.setFont(font_for_buttons);
        button_summ.setSize(60,20);
        button_summ.setLocation(300, 250);
        button_summ.setVisible(true);
        add(button_summ);
        button_summ.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button_0){
            text = text + button_0.getText();
            textField.setText(text);
        }
        else if(e.getSource() == button_1){
            text = text + button_1.getText();
            textField.setText(text);
        }
        else if(e.getSource() == button_2){
            text = text + button_2.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_3){
            text = text + button_3.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_4){
            text = text + button_4.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_5){
            text = text + button_5.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_6){
            text = text + button_6.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_7){
            text = text + button_7.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_8){
            text = text + button_8.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_9){
            text = text + button_9.getText();
            textField.setText(text);
        }

        else if(e.getSource() == button_point){
            text = text + button_point.getText();
            textField.setText(text);

        }

        else if(e.getSource() == button_summ){
            number_1 = Double.parseDouble(text);
            textField.setText(text + button_summ.getText());
            text = "";
            i = '+';
        }

        else if(e.getSource() == button_difference){
            number_1 = Double.parseDouble(text);
            textField.setText(text + button_difference.getText());
            text = "";
            i = '-';

        }

        else if(e.getSource() == button_mux){
            number_1 = Double.parseDouble(text);
            textField.setText(text + button_mux.getText());
            text = "";
            i = '*';
        }

        else if(e.getSource() == button_div){
            number_1 = Double.parseDouble(text);
            textField.setText(text + button_div.getText());
            text = "";
            i = '/';
        }

        else if(e.getSource() == button_equally){
            if(i == '+'){
                number_2 = Double.parseDouble(text);
                textField.setText(String.valueOf(numberFormat.format(number_1 + number_2)));
            }
            else if(i == '-'){
                number_2 = Double.parseDouble(text);
                textField.setText(String.valueOf(numberFormat.format(number_1 - number_2)));
            }
            else if(i == '*'){
                number_2 = Double.parseDouble(text);
                textField.setText(String.valueOf(numberFormat.format(number_1 * number_2)));
            }
            else if(i == '/'){
                number_2 = Double.parseDouble(text);
                textField.setText(String.valueOf(numberFormat.format(number_1 / number_2)));
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}