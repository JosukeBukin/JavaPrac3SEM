package ru.mirea.prac12.task3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.util.Objects;

public class task3 extends JFrame {

    private final JLabel window;

    private int imgNumber = 1;

    private task3() {

        this.setSize(1200, 1200);
        window = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("1.jpg"))), SwingConstants.CENTER);

        getContentPane().add(window);

        Timer timer = new Timer(2000, e ->nextImg());
        timer.start();
    }

    public void nextImg()
    {
        window.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++imgNumber) + ".jpg"))));
        if(imgNumber == 5) imgNumber = 0;
    }


    public static void main(String[] args)
    {
        task3 an = new task3();
        an.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        an.setVisible(true);
    }
}