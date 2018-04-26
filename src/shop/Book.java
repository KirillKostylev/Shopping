package shop;

import human.Human;

public class Book extends Goods {
    private int k;

    public Book(String name, int k, double price) {
        super(name);
        this.k = k;
        this.price = price;
    }

    @Override
    public void consume(Human human) {
        human.setIntelligence(human.getIntelligence() + k);
    }
}