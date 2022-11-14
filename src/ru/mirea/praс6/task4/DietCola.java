package ru.mirea.praс6.task4;

public class DietCola implements Priceable{
    private final int price;

    public DietCola(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
