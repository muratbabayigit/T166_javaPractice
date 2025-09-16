package day04;

import java.util.Scanner;

public class P03_whileLoop {
    public static void main(String[] args) {
        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise Girilen Sayı tamkare bir sayıdır
        //         değilse Girilen Sayı tamkare bir sayı değildir
        //         yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.print("KOntrol edilecek sayıyı giriniz: ");
        int sayi=scan.nextInt();
        int i=1;
        boolean tamKareMi=false;

        while (i*i<=sayi){
            if (i*i==sayi){
            tamKareMi=true;
            break;
            }
            i++;
        }
        if (tamKareMi){
            System.out.println("Girdiğiniz "+sayi+" sayısı "+i+" sayısının karesidir.");
        }else {
            System.out.println("Girdiğiniz sayı tam kare bir sayı değildir");
        }



    }
}
