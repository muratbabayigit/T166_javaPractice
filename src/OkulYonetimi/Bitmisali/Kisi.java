package OkulYonetimi.Bitmisali;

public class Kisi {
    /*
    Öğretmen: Ad-Soyad, Tc kimlik No, yaş
	Öğrenci: Ad-Soyad, Tc kimlik No, yaş
     */

    private String firstName;
    private String surName;
    private String tcNumber;
    private int age;

    public Kisi(String firstName, String surName, String tcNumber, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.tcNumber = tcNumber;
        this.age = age;
    }

    public Kisi() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTcNumber() {
        return tcNumber;
    }

    public void setTcNumber(String tcNumber) {
        this.tcNumber = tcNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" +
                "Adı : " + firstName + '\n' +
                "Soyadı : " + surName + '\n' +
                "TCKN : " + tcNumber + '\n' +
                "Yaşı :" + age+'\n' ;
    }
}
