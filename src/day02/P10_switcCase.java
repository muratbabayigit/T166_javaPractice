package day02;

import java.util.Scanner;

public class P10_switcCase {

    //Soru: Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı herhangi bir sayı giriniz ");
        System.out.print("Sayı: "); //sayi=321
        int sayi = scan.nextInt();

      if (sayi<=99 || sayi>=1000){
          System.out.println("Yanlış sayı girdiniz. Sayı üç basmaklı olmalıydı.\nİşlem Durduruluyor...");
      }else{
          int birlerBasmagi = sayi % 10; //bB=1
          sayi /= 10; //sayi=32
          int onlarBasmagi = sayi % 10; //oB=2
          int yuzlerBasmagi = sayi / 10; //yB=3

          switch (yuzlerBasmagi) {
              case 1:
                  System.out.println("Yüz");
                  break;
              case 2: System.out.print("İkiyüz");
                  break;
              case 3: System.out.print("Üçyüz");
                  break;
              case 4: System.out.print("Dörtyüz");
                  break;
              case 5: System.out.print("Beşyüz");
                  break;
              case 6: System.out.print("Altıyüz");
                  break;
              case 7: System.out.print("Yediyüz");
                  break;
              case 8: System.out.print("Sekizyüz");
                  break;
              case 9: System.out.print("Dokuzyüz");
                  break;
          }
          switch (onlarBasmagi){
              case 1: System.out.print("on");
                  break;
              case 2: System.out.print("yirmi");
                  break;
              case 3: System.out.print("otuz");
                  break;
              case 4: System.out.print("kırk");
                  break;
              case 5: System.out.print("elli");
                  break;
              case 6: System.out.print("altmış");
                  break;
              case 7: System.out.print("yetmiş");
                  break;
              case 8: System.out.print("seksen");
                  break;
              case 9: System.out.print("doksan");
                  break;
              case 0: System.out.print("");
                  break;

          }

          switch (birlerBasmagi){
              case 1: System.out.print("bir");
                  break;
              case 2: System.out.print("iki");
                  break;
              case 3: System.out.print("üç");
                  break;
              case 4: System.out.print("dört");
                  break;
              case 5: System.out.print("beş");
                  break;
              case 6: System.out.print("altı");
                  break;
              case 7: System.out.print("yedi");
                  break;
              case 8: System.out.print("sekiz");
                  break;
              case 9: System.out.print("dokuz");
                  break;
              case 0: System.out.print("");
                  break;

          }

      }




    }
}
