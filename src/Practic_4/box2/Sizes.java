package Practic_4.box2;

public enum Sizes {
    XXS(32){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    private Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return "размер одежды: " + name() + "(eurosize: " + euroSize + ") - " + getDescription();
    }
}
