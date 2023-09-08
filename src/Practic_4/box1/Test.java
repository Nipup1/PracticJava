package Practic_4.box1;

public class Test {
    public static void main(String[] args) {
        Seasons season1 = Seasons.Summer;
        System.out.println("1) " + season1);

        Seasons season2 = Seasons.Autum;
        iLike(season2);

        System.out.println("3)");
        for(Seasons season3: Seasons.values()){
            System.out.println("Время года: " + season3 + ", Средняя погода: " + season3.getTemp() + ", Аннотация: " + season3.getDescription());
        }
    }

    public static void iLike(Seasons season) {
        switch (season) {
            case Summer:
                System.out.println("2) Я люблю лето!");
                break;
            case Spring:
                System.out.println("2) Я люблю осень");
                break;
            case Winter:
                System.out.println("2) Я люблю зиму!");
                break;
            case Autum:
                System.out.println("2) Я люблю весну!");
                break;
        }
    }
}
