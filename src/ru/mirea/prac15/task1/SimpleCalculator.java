package ru.mirea.prac15.task1;


import javax.swing.*;
import java.awt.*;
class SimpleCalculator extends JFrame {
    JTextField jTextField_1 = new JTextField(5);
    JTextField jTextField_2 = new JTextField(5);
    JButton button_add = new JButton("Сложение");
    JButton button_sub = new JButton("Вычитание");
    JButton button_mux = new JButton("Умножение");
    JButton button_dis = new JButton("Деление");
    SimpleCalculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(700, 300);
        add(new JLabel("1 число"));
        add(jTextField_1);
        add(new JLabel("2 число"));
        add(jTextField_2);
        add(button_add);
        add(button_sub);
        add(button_mux);
        add(button_dis);

        button_add.addActionListener(e -> {
            try {
                double number_1 = Double.parseDouble(jTextField_1.getText().trim());
                double number_2 = Double.parseDouble(jTextField_2.getText().trim());
                JOptionPane.showMessageDialog(null, "Результат = " + (number_1 + number_2),
                        "Вывод результата", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ошибка в числах! Перепроверьте ваши числа!",
                        "Вывод результата", JOptionPane.ERROR_MESSAGE);
            }
        });
        button_sub.addActionListener(e -> {
            try{
                double number_1 = Double.parseDouble(jTextField_1.getText().trim());
                double number_2 = Double.parseDouble(jTextField_2.getText().trim());
                JOptionPane.showMessageDialog(null, "Результат = " + (number_1 - number_2),
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ошибка в числах! Перепроверьте ваши числа!",
                        "Alert", JOptionPane.ERROR_MESSAGE);
            }
        });
        button_mux.addActionListener(e -> {
            try{
                double number_1 = Double.parseDouble(jTextField_1.getText().trim());
                double number_2 = Double.parseDouble(jTextField_2.getText().trim());
                JOptionPane.showMessageDialog(null, "Результат = " + (number_1 * number_2),
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ошибка в числах! Перепроверьте ваши числа!",
                        "Alert", JOptionPane.ERROR_MESSAGE);
            }
        });
        button_dis.addActionListener(e -> {
            try{
                double number_1 = Double.parseDouble(jTextField_1.getText().trim());
                double number_2 = Double.parseDouble(jTextField_2.getText().trim());
                JOptionPane.showMessageDialog(null, "Результат = " + (number_1 / number_2),
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ошибка в числах! Перепроверьте ваши числа!",
                        "Alert", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    public static void main(String[] args){
        new SimpleCalculator().setVisible(true);
    }
}