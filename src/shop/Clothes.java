package shop;

import human.Human;

public class Clothes extends Goods {
    private int k;

    public Clothes(String name, int k, double price) {
        super(name);
        this.k = k;
        this.price = price;
    }

    @Override
    public void consume(Human human) {
        human.setCharisma(human.getCharisma() + k);
    }
}