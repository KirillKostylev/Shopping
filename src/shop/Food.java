package shop;

import human.Human;

public class Food extends Goods {
    private int k;

    public Food(String name, int k, double price) {
        super(name);
        this.k = k;
        this.price = price;
    }

    @Override
    public void consume(Human human) {
        human.setPower(human.getPower() + k);
    }
}

