package ru.mirea.prac_17.Task_17_3_Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Order {
    private String clientName;
    private String orderStatus;
    public String getClientName() {
        return clientName;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
class OrderController {
    private final Order model;
    public OrderController(Order model){
        this.model=model;
    }
    public String getClientName() {
        return model.getClientName();
    }
    public String getOrderStatus() {
        return model.getOrderStatus();
    }
    public void setClientName(String clientName) {
        model.setClientName(clientName);
        checkOrderStatus();
    }
    private void setOrderStatus(String orderStatus) {
        model.setOrderStatus(orderStatus);
    }
    private void checkOrderStatus(){setOrderStatus("ready");}
}
class OrderView extends JFrame {
    private final OrderController controller;
    JTextField name_field;
    public OrderView(OrderController controller) {
        super("Order");
        super.setBounds(200, 100, 300, 120);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.controller = controller;
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(2,2,5,5));
        JLabel name = new JLabel("Enter your name");
        name_field = new JTextField("",1);
        JLabel submit = new JLabel("Check order status");
        JButton button = new JButton("OK");
        container.add(name);
        container.add(name_field);
        container.add(submit);
        container.add(button);
        button.addActionListener(new ButtonEventManager(controller));
    }
    class ButtonEventManager implements ActionListener {
        private final OrderController controller;
        ButtonEventManager(OrderController controller){
            this.controller = controller;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String msg = name + ", your order is ";
            controller.setClientName(name);
            JOptionPane.showMessageDialog(null,
                    msg +controller.getOrderStatus(), "Order status", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
