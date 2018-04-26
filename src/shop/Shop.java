package shop;

import human.Human;


import java.util.Arrays;
import java.util.List;

public class Shop {
    private static final List<Goods> GOODS = Arrays.asList(new Book("Harry Potter", 5, 17),
            new Clothes("T-shorts", 3, 11));

    public static void buy(Human human, Goods goods) {
        try {
            boolean isThere = false;
            for (Goods t : GOODS) {
                if (goods.name == t.name) {
                    isThere = true;
                }
            }
            if (!isThere) {
                throw new IllegalStateException();
            }
            if (human.getMoney() < Goods.price) {
                throw new IllegalArgumentException();
            }
            if (isThere) {
                human.getListGoods().add(goods);
                human.setMoney(human.getMoney() - Goods.price);
                GOODS.remove(goods);
                goods.owner = human;
            }
        } catch (IllegalStateException e) {
            System.out.println("Данный товар отсутствует в ассортименте");
        } catch (IllegalArgumentException e) {
            System.out.println("Недостаточно средств");
        }
    }
}