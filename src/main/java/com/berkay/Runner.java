package com.berkay;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        CustomStringTr customStringTr = new CustomStringTr("  Merhaba Dunya Nasilsiniz.  ");
        System.out.println("Uzunluk: " + customStringTr.uzunluk());
        System.out.println("---------------------------------------------");
        System.out.println("Kucuk harfe donustur: " + customStringTr.kucukHarf());
        System.out.println("---------------------------------------------");
        System.out.println("Buyuk harfe donustur: " + customStringTr.buyukHarf());
        System.out.println("---------------------------------------------");
        System.out.println("Bastan ve sondan bosluklari kaldir : " + customStringTr.boslukKaldir());
        System.out.println("---------------------------------------------");
        System.out.println("Karakter al : " + customStringTr.ifadeAl(2));
        System.out.println("---------------------------------------------");
        System.out.println("Ifade ara : " + customStringTr.ifadeAra("Mer"));
        System.out.println("---------------------------------------------");
        System.out.println("Parcala : " + Arrays.toString(customStringTr.parca(" ")));
        System.out.println("---------------------------------------------");
        System.out.println("Degistir : " + customStringTr.replace("Merhaba", "Hello"));
        System.out.println("---------------------------------------------");
        System.out.println("Son deger bul : " + customStringTr.sonDegerBulma("a", 28));
        System.out.println("---------------------------------------------");
        System.out.println("Ilk deger bul : " + customStringTr.ilkDegerBul("a", 0));
    }
}
