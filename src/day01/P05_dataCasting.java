package day01;

import java.util.Scanner;

public class P05_dataCasting {
    public static void main(String[] args) {
        // byte<short<int<float<long<double

          /*
             Kullanıcıdan iki adet ondalıklı sayı
             alıp bu ondalıklı sayıları birbirine bölüp
             sonucu tamsayı olarak yazdırın
        */

          Scanner scan = new Scanner(System.in);
    //    System.out.println("iki adet ondalıklı sayı giriniz!");
    //    System.out.print("1.Sayı: ");
    //    double sayi1=scan.nextDouble();
    //    System.out.print("2.Sayı: ");
    //    double sayi2=scan.nextDouble();
    //    int sonuc=(int)(sayi1/sayi2);   //Explicit Narrowing [ Veri Kaybı Yaşanabilir ]
    //    System.out.println("sonuc = " + sonuc);



        /*
             Kullanıcıdan iki adet tam sayı
             alıp bu ondalıklı sayıları birbirine bölüp
             sonucu ondalıklı olarak yazdırın
     */

        System.out.println("iki adet tam sayı giriniz!");
        System.out.print("1.Sayı: ");
        int sayi3=scan.nextInt();
        System.out.print("2.Sayı: ");
        double sayi4=scan.nextDouble();

        double sonuc2=(sayi3/sayi4); // Auto Widening
        System.out.println("sonuc2 = " + sonuc2);



    }
}
