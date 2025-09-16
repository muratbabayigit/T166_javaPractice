package day04;

import java.util.Scanner;

public class P04_doWhileLoop {

    // Verilen bir sayının faktöriyelini özyineli (recursive) olarak
    // hesaplayan fonksiyonu yazınız.
    public static void main(String[] args) {

        // 5!=5.4.3.2.1   5!=120 olur

    Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int sayi=scan.nextInt();
        int faktoriyelDeger=1;
      do {
          faktoriyelDeger*=sayi;
          sayi--;
      }while(sayi>0);
      System.out.println("Verilen Sayının Faktoriyel Değeri : "+faktoriyelDeger);

     //   while(sayi>0){
     //       faktoriyelDeger*=sayi;
     //       sayi--;
     //   }
     //   System.out.println("Verilen Sayının Faktoriyel Değeri :"+faktoriyelDeger);
    }
}
