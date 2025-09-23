package OkulYonetimi;

public class Ogrenci extends Kisi{
/*
    sinif ve numara
*/
    private String className;
    private int stNumber;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStNumber() {
        return stNumber;
    }

    public void setStNumber(int stNumber) {
        this.stNumber = stNumber;
    }

    public Ogrenci(String firstname, String lastname, String persId, int age, String className, int stNumber) {
        super(firstname, lastname, persId, age);
        this.className = className;
        this.stNumber = stNumber;
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return " " +super.toString() +
                "className='" + className + '\'' +
                ", stNumber=" + stNumber +
                '}';
    }
}
