package hu.petrik.OOPalapok;

import hu.petrik.OOPalapok.kor.Kor;
import java.util.random.*;


public class Main {
    public static void main(String[] args){
        Kor k = new Kor();
        Kor k2 = new Kor(10);
        Kor k3 = new Kor(4,5,7);
        System.out.printf("%s-nek a Kerülete: %.3f\n", k2, k2.getKerulet());
        System.out.printf("%s-nek a Területe: %.3f\n", k2, k2.getKerulet());




    }
}