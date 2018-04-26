package shop;

import human.Human;

public abstract class Goods {
    protected String name;
    protected  static double price;
    protected Human owner = null;

    public Goods(String name) {
        this.name = name;
    }

    public abstract void consume(Human human);


}
