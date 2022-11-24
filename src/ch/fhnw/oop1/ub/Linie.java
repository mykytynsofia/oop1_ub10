package ch.fhnw.oop1.ub;

public enum Linie {
    PURE{
        @Override
        public String toString(){
            return "smart & pure";
        }
        @Override
        public int getPrice(){
            return 14390;
        }
    },
    PULSE{
        @Override
        public String toString(){
            return "smart & pulse";
        }
        @Override
        public int getPrice(){
            return 15590;
        }
    },
    PASSION{
        @Override
        public String toString(){
            return "smart & passion]";
        }
        @Override
        public int getPrice(){
            return 16790;
        }
    };
    public abstract int getPrice();
}
