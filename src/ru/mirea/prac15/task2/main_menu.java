package ru.mirea.prac15.task2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_menu {
    public static void main(String[] args){
        String[] optionsToChoose = {
                "Australia",
                "China",
                "England",
                "Russia"
        };
        JFrame jFrame = new JFrame();
        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(60,50,140,20);

        JButton jButton = new JButton("Done");
        jButton.setBounds(80, 90, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(70, 100, 500, 100);

        jFrame.add(jComboBox);
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.setLayout(null);
        jFrame.setSize(650, 200);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = jComboBox.getItemAt(jComboBox.getSelectedIndex());
                if(selected == "Australia"){
                    selected = "Государство в Южном полушарии";
                    jLabel.setText(selected);
                }
                else if(selected == "China"){
                    selected = "Государство в Восточной Азии.";
                    jLabel.setText(selected);
                }
                else if(selected == "England"){
                    selected = "Население Англии составляет 84% от общего числа населения Великобритании";
                    jLabel.setText(selected);
                } else if (selected == "Russia") {
                    selected = "Государство в Восточной Европе и Северной Азии.";
                    jLabel.setText(selected);
                }
            }
        });

    }
}
