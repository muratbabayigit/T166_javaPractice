package OkulYonetimi.Bitmisali;

import java.util.Scanner;

public class AnaMenu {
    /*
    2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için aşağıdaki gibi bir menü gösterilsin.

	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ

	SEÇİMİNİZ:
     */
    void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t\t1-ÖĞRENCİ İŞLEMLERİ\n" +
                "\t\t2-ÖĞRETMEN İŞLEMLERİ\n" +
                "\t\tQ-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");

        char secim=scan.next().toUpperCase().charAt(0);
        switch(secim){
            case '1':{
                OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrMenu();
                break;
            }
            case '2':{
                OgretmenIslemleri ogretmenIslemleri=new OgretmenIslemleri();
                ogretmenIslemleri.ogrtMenu();
                break;
            }
            case 'Q':{
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Hatalı Giriş Yaptınız!");
                menu();
            }
        }

    }
}
