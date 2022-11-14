package ru.mirea.praс6.task11;

public class Celsius implements Convertable {
    private final double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public double convertF() {
        return value * 1.8 + 32;
    }

    @Override
    public double convertK() {
        return value + 273.15;
    }
}
