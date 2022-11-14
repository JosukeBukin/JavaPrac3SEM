package ru.mirea.prac15.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args){
        new Window();
    }
}
class Window extends JFrame implements WindowListener, ActionListener {
    private final TextField textField = new TextField();
    private final JButton button_9 = new JButton("9");
    private final JButton button_8 = new JButton("8");
    private final JButton button_7 = new JButton("7");
    private final JButton button_div = new JButton("/");
    private final JButton button_4 = new JButton("4");
    private final JButton button_5 = new JButton("5");
    private final JButton button_6 = new JButton("6");
    private final JButton button_1 = new JButton("1");
    private final JButton button_2 = new JButton("2");
    private final JButton button_3 = new JButton("3");
    private final JButton button_mux = new JButton("*");
    private final JButton button_difference = new JButton("-");
    private final JButton button_0 = new JButton("0");
    private final JButton button_point = new JButton(".");
    private final JButton button_equally = new JButton("=");
    private final JButton button_summ = new JButton("+");
    ArrayList<JButton> buttons = new ArrayList<>();
    private String text = "";
    private double number_1  = 0;
    private char i;
    void addAndSetUpButtons(){
        buttons.add(button_0);
        buttons.add(button_1);
        buttons.add(button_2);
        buttons.add(button_3);
        buttons.add(button_4);
        buttons.add(button_5);
        buttons.add(button_6);
        buttons.add(button_7);
        buttons.add(button_8);
        buttons.add(button_9);
        buttons.add(button_summ);
        buttons.add(button_difference);
        buttons.add(button_point);
        buttons.add(button_equally);
        buttons.add(button_div);
        buttons.add(button_mux);
        Font font_for_buttons = new Font("Times new Roman", Font.PLAIN, 20);
        for (JButton button: buttons) {
            button.setFont(font_for_buttons);
            button.setSize(60,20);
            button.setVisible(true);
            button.addActionListener(this);
            add(button);
        }
        button_div.setLocation(300, 100);
        button_9.setLocation(210, 100);
        button_8.setLocation(120, 100);
        button_7.setLocation(30, 100);
        button_4.setLocation(30, 150);
        button_5.setLocation(120, 150);
        button_6.setLocation(210, 150);
        button_mux.setLocation(300, 150);
        button_1.setLocation(30, 200);
        button_2.setLocation(120, 200);
        button_3.setLocation(210, 200);
        button_difference.setLocation(300, 200);
        button_0.setLocation(30, 250);
        button_point.setLocation(120, 250);
        button_equally.setLocation(210, 250);
        button_summ.setLocation(300, 250);
    }
    NumberFormat numberFormat = new DecimalFormat("#.######");
    public Window(){
        Font font = new Font("Impact", Font.BOLD, 40);
        setLayout(null);
        setSize(400, 320);
        setVisible(true);
        setLocation(700, 250);
        textField.setLocation(25, 25);
        textField.setFont(font);
        textField.setSize(350, 50);
        textField.setVisible(true);
        add(textField);
        addAndSetUpButtons();
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
            double number_2 = 0;
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
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}