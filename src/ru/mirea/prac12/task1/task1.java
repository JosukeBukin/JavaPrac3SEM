package ru.mirea.prac12.task1;

import javax.swing.*;
import java.awt.*;


class Oval extends Shape {
    public Oval()
    {
        setWeight(Math.random() * 600);
        setHeight(Math.random() * 600);
    }
    void paint(Graphics2D g )
    {
        setColor(Math.random() * 0x1000000);
        g.setColor(new Color((int) color));
        g.fillOval(
                (int) (Math.random() * 600),
                (int) (Math.random() * 600),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200)

        );
    }
}

class Rect extends Shape {
    public Rect()
    {
        setWeight(Math.random() * 600);
        setHeight(Math.random() * 600);
    }
    void paint(Graphics2D g )
    {
        g.setColor(new Color((int) color));
        g.fillRect(
                (int) (Math.random() * 600),
                (int) (Math.random() * 600),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200)

        );
    }
}

class RoundedRect extends Shape {
    public RoundedRect()
    {
        setWeight(Math.random() * 500);
        setHeight(Math.random() * 500);
    }
    void paint(Graphics2D g )
    {
        setColor(Math.random() * 0x1000000);
        g.setColor(new Color((int) color));
        g.fillRoundRect(
                (int) (Math.random() * 500),
                (int) (Math.random() * 500),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200)

        );
    }
}

class Circle extends Shape {
    public Circle()
    {
        setWeight(Math.random() * 500);
        setHeight(Math.random() * 500);
    }
    void paint(Graphics2D g )
    {
        setColor(Math.random() * 0x1000000);
        g.setColor(new Color((int) color));
        g.fillOval(
                (int) (Math.random() * 500),
                (int) (Math.random() * 500),
                (int) (Math.random() * 200),
                (int) (Math.random() * 200)

        );
    }
}
public class task1 extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path;
    int method;
    int out = 0;

    task1() {
        super("Фигуры");
        setSize(600, 600);
        this.method = 0;
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                animate(20, g);
                this.method += 1;
                break;

            default:
                break;
        }
    }

    void animate(int n, Graphics2D g)
    {
        Circle circle = new Circle();
        Rect rect = new Rect();
        RoundedRect roundedRect = new RoundedRect();
        Oval oval = new Oval();
        while (n > 0) {
            int choice = (int) (Math.random() * 4);

            switch (choice) {
                case 1:
                    circle.paint(g);
                    n -= 1;
                    break;
                case 2:
                    rect.paint(g);
                    n -= 1;
                    break;
                case 3:
                    roundedRect.paint(g);
                    n -= 1;
                    break;
                case 4:
                    oval.paint(g);
                    n -= 1;
                    break;
                default:
                    break;
            }
        }
    }



    public static void main(String[] args)
    {
        task1 an = new task1();
        an.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        an.setVisible(true);
    }
}