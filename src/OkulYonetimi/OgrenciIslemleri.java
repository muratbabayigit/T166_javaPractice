package OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements I_islemler {
    /*
            ============= İŞLEMLER =============
             1-EKLEME
             2-ARAMA
             3-LİSTELEME
             4-SİLME
             5-ANA MENÜ
             Q-ÇIKIŞ

        SEÇİMİNİZ:

     */
    Scanner scan = new Scanner(System.in);
    int stNumber = 1000;
    List<Ogrenci> ogrenciList = new ArrayList<>();




    @Override
    public void ekleme() {
        System.out.println("==================================");
        System.out.println("Yeni Öğrenci Bilgi Giriş Ekranı");
        System.out.println("==============================");
        scan.nextLine();
        System.out.print("Öğrenci Adı: ");
        String firstname= scan.nextLine();
        System.out.print("Öğrenci Soyadı: ");
        String lastname= scan.nextLine();
        System.out.print("TC Kimlik: ");
        String idNumber= scan.nextLine();
        System.out.print("Öğrenci Yaş: ");
        int age= scan.nextInt();
        System.out.print("Sınıfı: ");
        String className= scan.nextLine();

        Ogrenci ogrEkle=new Ogrenci(firstname,lastname,idNumber,age,className,stNumber++);
        System.out.println();
        System.out.println("İşlem tamamlandı...");


    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }

    void ogrmenu(){
        System.out.print("\t============= ÖĞRENCİ İŞLEMLERİ =============\n" +
                "\t\t1-EKLEME\n" +
                "\t\t2-ARAMA\n" +
                "\t\t3-LİSTELEME\n" +
                "\t\t4-SİLME\n" +
                "\t\t5-ANA MENÜ\n" +
                "\t\tQ-ÇIKIŞ\n" +
                "\t\t\n" +
                "\tSEÇİMİNİZ:");
        char secim=scan.next().toLowerCase().charAt(0);
        switch (secim) {
            case '1': ekleme();break;
            case '2': arama();break;
            case '3': listeleme();break;
            case '4': silme();break;
            case '5': anaMenu();break;
            case 'Q': cikis();break;
            default:
                System.out.println("hatalı Giriş Yaptınız");
        }



    }

}
