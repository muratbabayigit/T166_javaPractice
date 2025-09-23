package OkulYonetimi.Bitmisali;

public class Ogrenci extends Kisi {
    //Öğrenci: Ad-Soyad, Tc kimlik No, yaş, numara, sınıf bilgileri içermelidir.
    private int number;
    private int sinif;

    public Ogrenci(String firstName, String surName, String tcNumber, int age, int number, int sinif) {
        super(firstName, surName, tcNumber, age);
        this.number = number;
        this.sinif = sinif;
    }

    public Ogrenci() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return " "+super.toString() +
                "Numarası: " + number +"\n"+
                "Sınıfı: " + sinif ;
    }
}
