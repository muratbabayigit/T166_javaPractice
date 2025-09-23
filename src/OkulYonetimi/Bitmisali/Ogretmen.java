package OkulYonetimi.Bitmisali;

public class Ogretmen extends Kisi {
    //Öğretmen: Ad-Soyad, Tc kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.

    private String bolum;
    private int sicilNo;

    public Ogretmen(String firstName, String surName, String tcNumber, int age, String bolum, int sicilNo) {
        super(firstName, surName, tcNumber, age);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{"+super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }

}
