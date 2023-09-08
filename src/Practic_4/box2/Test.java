package Practic_4.box2;

public class Test {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.XS, 350, "темно-серый"),
                new TShirt(Sizes.L, 250, "черный"),
                new Pants(Sizes.M, 500, "голубой"),
                new Pants(Sizes.XXS, 225, "синий"),
                new Skirt(Sizes.S, 400, "розовый"),
                new Skirt(Sizes.M, 520, "красный"),
                new Tie(Sizes.L, 300, "синий"),
                new Tie(Sizes.L, 280, "красный"),
        };

        Atelier studio = new Atelier();
        studio.dressMan(clothes);
        System.out.println();
        studio.dressWomen(clothes);
    }
}
