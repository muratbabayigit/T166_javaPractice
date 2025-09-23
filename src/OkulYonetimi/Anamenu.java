package OkulYonetimi;

import java.util.Scanner;

public class Anamenu {
/*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ

	SEÇİMİNİZ:
 */
    void Menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ \n" +
                "====================================");
        System.out.println("\t1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\tQ- ÇIKIŞ");
        System.out.print("SEÇİMİNİZ: ");
        char secim=scan.next().toUpperCase().charAt(0);
            switch (secim) {
                case '1': OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrmenu();

            }





    }

}
