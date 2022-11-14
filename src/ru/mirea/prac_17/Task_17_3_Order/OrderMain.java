package ru.mirea.prac_17.Task_17_3_Order;

public class OrderMain {
    public static void main(String[] args) {
        Order model = new Order();
        OrderController controller = new OrderController(model);
        OrderView view = new OrderView(controller);
        view.setVisible(true);
    }
}
