package OkulYonetimi.Bitmisali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements I_islemler{
    /*
         ============= ÖĞRENCİ İŞLEMLERİ =============
		    1-EKLEME
		    2-ARAMA
		    3-LİSTELEME
		    4-SİLME
		    5-ANA MENÜ
		    Q-ÇIKIŞ

	    SEÇİMİNİZ:
     */
    Scanner scan=new Scanner(System.in);
    int number=1000;
    List<Ogrenci> ogrenciList=new ArrayList<>();

    void ogrMenu(){
        System.out.print("\t============= ÖĞRENCİ İŞLEMLERİ =============\n" +
                "\t\t1-EKLEME\n" +
                "\t\t2-ARAMA\n" +
                "\t\t3-LİSTELEME\n" +
                "\t\t4-SİLME\n" +
                "\t\t5-ANA MENÜ\n" +
                "\t\tQ-ÇIKIŞ\n" +
                "\t\t\n" +
                "\tSEÇİMİNİZ:");
        char secim=scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{ekleme();break;}
            case '2':{arama();break;}
            case '3':{listeleme();break;}
            case '4':{silme();break;}
            case '5':{anaMenu();break;}
            case 'Q':{cikis();break;}
            default:{
                System.out.println("Hatalı Giriş Yaptınız");
            }
        }
    }

    @Override
    public void ekleme() {
        System.out.println("==================================");
        System.out.println("Yeni Öğrenci Bilgi Giriş Ekranı");
        System.out.println("==============================");
        scan.nextLine();
        System.out.print("Öğrenci Adı:");
        String firstName= scan.nextLine();
        System.out.print("Öğrenci Soyadı:");
        String surName= scan.nextLine();
        System.out.print("TC Kimlik No: ");
        String tcNumber= scan.nextLine();
        System.out.print("Yaşı:");
        int age= scan.nextInt();
        System.out.print("Sınıfı:");
        int sinif= scan.nextInt();
        Ogrenci ogrenci=new Ogrenci(firstName,surName,tcNumber,age,number++,sinif);
        ogrenciList.add(ogrenci);
        System.out.println(" ");
        System.out.println("İşlem tamamlandı\n");
        System.out.println("Öğrenci Bilgileri\n");
        listeleme();
        ogrMenu();



    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.print("Aradığınız kişinin TC Kimlik Numarasını Giriniz:");
        String tcNumber= scan.nextLine();

        for ( Ogrenci each:ogrenciList) {
            if (each.getTcNumber().equals(tcNumber)){
                System.out.println("Aradığınız Kişi "+each);
                ogrMenu();
            }else{
                System.out.println("Kayıtlarımızda "+tcNumber+" ile kayıtlı bir kişi yoktur");
                ogrMenu();
            }

        }

    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList)
            System.out.println(each);

    }

    @Override
    public void silme() {
        System.out.print("Silinecek Kişinin Tc Kimlik Numrasını Giriniz: ");
        String tcNumber= scan.nextLine();
        boolean flag=true;
        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNumber().equals(tcNumber)){
                System.out.println(ogrenciList.get(i)+" kişisi bilgileriyle silinecek");
                ogrenciList.remove(i);
                flag=false;
                listeleme();
            }
            if (flag){
                System.out.println(tcNumber+" kimlik numaralı bir kayıt bulunamadı");
                ogrMenu();
        }

        }



    }

    @Override
    public void anaMenu() {
        AnaMenu anaMenu=new AnaMenu();
        anaMenu.menu();
    }

    @Override
    public void cikis() {
        AnaMenu anaMenu=new AnaMenu();
        anaMenu.menu();

    }
}
