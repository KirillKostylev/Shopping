package main;


import human.Human;

import shop.Book;
import shop.Clothes;
import shop.Food;
import shop.Shop;


public class main {
    public static void main(String[] args) {
        Human firstPerson = new Human("Кирилл", 3, 2, 4, 111);
        System.out.println("До покупки:\n"+firstPerson.toString());
        Clothes clothes = new Clothes("T-shorts", 3, 11);
        Book book = new Book("Harry Potter" , 5 , 17);
        Food food = new Food("twix" , 2 , 5);
        Shop.buy(firstPerson, clothes);
        Shop.buy(firstPerson, book);
        Shop.buy(firstPerson, food);
        System.out.println("После покупки:\n"+firstPerson.toString());
        firstPerson.consumeAll(clothes);
        firstPerson.consumeAll(book);
        firstPerson.consumeAll(food);
        System.out.println("После пременения:\n"+firstPerson.toString());
    }
}
