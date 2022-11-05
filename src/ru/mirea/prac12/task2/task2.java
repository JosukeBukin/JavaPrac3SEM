package ru.mirea.prac12.task2;

import javax.swing.*;

public class task2 extends JFrame {
    private JLabel window;
    String randomImage = "1.jpg";
    private task2()
    {
        super("Какая-то картинка");
        setSize(1200, 1200);
        window = new JLabel("", new ImageIcon(getClass().getResource("")), SwingConstants.CENTER);
        getContentPane().add(window);
    }

    public void setImg(String prac)
    {
        window.setIcon(new ImageIcon(getClass().getResource((prac))));
    }

    public static void main(String[] args)
    {
        task2 an = new task2();
        if(args.length > 0) an.setImg(args[0]);
        an.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        an.setVisible(true);
    }
}