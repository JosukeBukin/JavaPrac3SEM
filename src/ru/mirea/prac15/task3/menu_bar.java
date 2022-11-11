package ru.mirea.prac15.task3;

import javax.swing.*;
import java.awt.*;

public class menu_bar extends JFrame {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(createFileMenu());
        jMenuBar.add(EditFileMenu());
        jMenuBar.add(HelpMenuFile());
        jMenuBar.setSize(100, 25);

        JButton jButton_1 = new JButton("Button 1");
        jButton_1.setBounds(20, 70, 90, 20);

        JButton jButton_2 = new JButton("Button 2");
        jButton_2.setBounds(130, 70, 90, 20);

        jFrame.add(jMenuBar);
        jFrame.add(jButton_1);
        jFrame.add(jButton_2);

        jFrame.setLayout(null);
        jFrame.setSize(350, 200);
        jFrame.setVisible(true);

    }

    private static JMenu createFileMenu(){
        JMenu file = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(save);
        file.addSeparator();
        file.add(exit);
        return file;
    }

    private static JMenu EditFileMenu(){
        JMenu file = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Cope");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem insert = new JMenuItem("Insert");
        file.add(copy);
        file.addSeparator();
        file.add(cut);
        file.addSeparator();
        file.add(insert);
        return file;
    }

    private static JMenu HelpMenuFile(){
        JMenu file = new JMenu("Edit");
        return file;
    }
}