package human;

import shop.Goods;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int charisma;
    private int intelligence;
    private int power;
    private double money;
    private List<Goods> listGoods = new ArrayList<>();

    public Human(String name, int charisma, int intelligence, int power, double money) {
        this.name = name;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.power = power;
        this.money = money;
    }

    public void consumeAll(Goods goods) {
        for (Goods t : listGoods) {
            if (t != null) {
                goods.consume(this);
                listGoods.remove(t);
                break;
            } else {
                System.out.println("Список вещей пуст");
            }
        }
    }

    public List getListGoods() {
        return listGoods;
    }

    public double getMoney() {
        return money;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "human.Human{" +
                "name='" + name + '\'' +
                ", charisma='" + charisma + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", money=" + money +
                ", listGoods=" + listGoods +
                '}';
    }
}
