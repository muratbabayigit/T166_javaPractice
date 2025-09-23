package OkulYonetimi.Bitmisali;

import java.util.Scanner;

public class OgretmenIslemleri implements I_islemler{
      /*
         ============= ÖĞRETMEN İŞLEMLERİ =============
		    1-EKLEME
		    2-ARAMA
		    3-LİSTELEME
		    4-SİLME
		    5-ANA MENÜ
		    Q-ÇIKIŞ

	    SEÇİMİNİZ:
     */
    Scanner scan=new Scanner(System.in);
    void ogrtMenu(){
        System.out.println("\t============= ÖĞRETMEN İŞLEMLERİ =============\n" +
                "\t\t1-EKLEME\n" +
                "\t\t2-ARAMA\n" +
                "\t\t3-LİSTELEME\n" +
                "\t\t4-SİLME\n" +
                "\t\t5-ANA MENÜ\n" +
                "\t\tQ-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");

        char secim=scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{ekleme();break;}
            case '2':{arama();break;}
            case '3':{listeleme();break;}
            case '4':{silme();break;}
            case '5':{anaMenu();break;}
            case 'Q':{cikis();break;}
        }
    }

    @Override
    public void ekleme() {

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
}
