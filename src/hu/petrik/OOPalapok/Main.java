package hu.petrik.OOPalapok;

import hu.petrik.OOPalapok.kor.Kor;
import java.util.random.*;


public class Main {
    public static void main(String[] args){
        Kor k = new Kor();
        Kor k2 = new Kor(10);
        Kor k3 = new Kor(4,5,7);
        Kor k4 = new Kor(33,3,70);
        Kor k5 = new Kor(34,55,43);
        Kor k6 = new Kor(-13,90,50);
        System.out.printf("%s-nek a Kerülete: %.3f\n", k2, k2.getKerulet());
        System.out.printf("%s-nek a Területe: %.3f\n", k2, k2.getKerulet());




    }
}