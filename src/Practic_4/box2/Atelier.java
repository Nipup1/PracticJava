package Practic_4.box2;

public class Atelier {
    public void dressMan(Clothes [] clothes){
        System.out.println("Мужская одежда:");
        for(Clothes el: clothes){
            if(el instanceof MenClothing){
                System.out.println(el);
            }
        }
    }

    public void dressWomen(Clothes [] clothes){
        System.out.println("Женская одежда:");
        for(Clothes el: clothes){
            if(el instanceof WomenClothing){
                System.out.println(el);
            }
        }
    }
}
