package ch.fhnw.oop1.ub;

public enum Motorisierung {
    DIESEL{
        @Override
        public String toString(){
            return "diesel";
        }
        @Override
        public int getPrice() {
            return 1200;
        }
    },
    BENZIN{
        @Override
        public String toString(){
            return "benzin";
        }
        @Override
        public int getPrice() {
            return 0;
        }
    };
    public abstract int getPrice();
}
