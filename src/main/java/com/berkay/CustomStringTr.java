package com.berkay;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String ifade) {
        this.ifade = ifade;
    }

    public int uzunluk() {
        return ifade.length();
    }

    public String kucukHarf() {
        return ifade.toLowerCase();
    }

    public String buyukHarf() {
        return ifade.toUpperCase();
    }

    public String boslukKaldir() { // bastan ve sondan boşlukları kaldırdık
        return ifade.trim();
    }

    public char ifadeAl(int index) {
        return ifade.charAt(index);
    }

    public boolean ifadeAra(String aranan) {  //true veya false döner
        return ifade.contains(aranan);
    }

    public String[] parca(String parca) {
        return ifade.split(parca);
    }

    public String replace(String eskiDizi, String yeniDizi) {
        return ifade.replace(eskiDizi, yeniDizi);
    }

    public int sonDegerBulma(String aranan, int indeks) {
        return ifade.lastIndexOf(aranan, indeks);
    }

    public int ilkDegerBul(String aranan, int indeks) {
        return ifade.indexOf(aranan, indeks);
    }

}
