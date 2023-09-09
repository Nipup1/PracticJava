package Practic_4_1.box9;

import Practic_4.box3.Product;

public class FurnitureShop {

    public static void main(String[] args) {
        Furniture[] list = new Furniture[]{
                new Table(1500, "белый", 15, 6,8),
                new Chair(2000, "оранжевый", 3, 4,5),
                new Table(500, "чёрный", 8, 1,7),
                new Table(1500, "фиолетовый", 5, 16,18),
                new Closet(1500, "синий", 1, 26,3),
                new Closet(1500, "голубой", 9, 16,5),
        };

        for(Furniture el: list){
            System.out.println(el);
        }
    }
}
