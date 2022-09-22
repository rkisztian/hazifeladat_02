package hu.petrik.OOPalapok.kor;

    public class Kor {
        private int a;
        private int b;
        private int r;


    public Kor(int a, int b, int r){
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public Kor(int r){
        this.a = 0;
        this.b = 0;
        this.r= r;
    }

    public  Kor(){
        this.a = (int) (Math.random()* (2*10 + 1)) -10;
        this.b = (int) (Math.random()* (2*10 + 1)) -10;
        this.r = (int) (Math.random()* ((10 - 1) + 1)) +1;
    }

    public double getKerulet() {
        return 2 * this.r * Math.PI;
        }

    public double getTerulet() {
        return Math.pow(this.r, 2) * Math.PI;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d, %d)",this.a, this.b, this.r);
        }
    }
