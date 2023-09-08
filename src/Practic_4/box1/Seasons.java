package Practic_4.box1;

public enum Seasons{
    Summer(22){
        @Override
        public String getDescription(){
            return "Тёплое время года :(";
        }
    },
    Spring(9){
        @Override
        public String getDescription(){
            return "Скоро холодное время года :/";
        }
    },
    Winter(-7),
    Autum(9) {
        @Override
        public String getDescription(){
            return "Скоро тёплое время года :/";
        }
    },;

    private int Temp;
    private Seasons(int temp){
        Temp = temp;
    }

    public int getTemp() {
        return Temp;
    }

    public String getDescription(){
        return "Холодное время года :(";
    }
}
