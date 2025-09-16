package day04;

import java.util.Scanner;

public class P02_whileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 10 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sizden istenilen 10 sayıyı sırasıyla giriniz!");
        System.out.println("-----------------------------------------------------");
        int enBuyuk=0;
        int sayi=0;
        int sayac=1;

        while (sayac<=10){
            System.out.print(sayac+". sayıyı giriniz: ");
            sayi=scan.nextInt();

            if (sayi>enBuyuk) {
                enBuyuk=sayi;
            }
            sayac++;
        }
        System.out.println("Girilen 10 sayıdan en büyüğü "+enBuyuk+" olarak tespit edilmiştir.");



    }
}
