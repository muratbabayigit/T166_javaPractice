package OkulYonetimi;

public class Kisi {
    /*
    Öğretmen: Ad-Soyad, Tc kimlik No, yaş
	Öğrenci: Ad-Soyad, Tc kimlik No, yaş
     */

    private String firstname;
    private String lastname;
    private String persId;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPersId() {
        return persId;
    }

    public void setPersId(String persId) {
        this.persId = persId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Kisi(String firstname, String lastname, String persId, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.persId = persId;
        this.age = age;
    }

    public Kisi() {
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", persId='" + persId + '\'' +
                ", age=" + age +
                '}';
    }
}
