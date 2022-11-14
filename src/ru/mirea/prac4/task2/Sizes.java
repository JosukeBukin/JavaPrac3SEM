package ru.mirea.prac4.task2;

public enum Sizes {
    XXS(32) {
        public String getDescription() { return "children size"; }
    }, XS(34), S(36), M(38), L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "adult size";
    }
}
