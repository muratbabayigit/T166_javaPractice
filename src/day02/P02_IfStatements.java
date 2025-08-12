package day02;

import java.util.Scanner;

public class P02_IfStatements {
    public static void main(String[] args) {
        // Bağımsız if
        // if else - sadece 1 doğru seçenek var
        // if elseif - doğru sayısı birden fazla ise kullanılır
        // Tüm doğru seçenekler bitince kalan herşey için else kullanılır

        // Kullanıcıdan  bir sayı alın sayı çift ise sayı çift sayıdır. Tek ise sayı tek sayıdır
        // Sıfır girmişse Sıfır girdiniz yazdırsın

        //Bağımsız if ile çözüm
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scan.nextInt();

     //   if (sayi!=0){
     //       if (sayi%2==0){
     //           System.out.println("Girdiğiniz "+sayi+" sayısı bir çift sayıdır");
     //       }
     //       if (sayi%2!=0){
     //           System.out.println("Girdiğiniz "+sayi+" sayısı bir tek sayıdır");
     //       }
     //   }
//
     //   if (sayi==0){
     //
     //   }

        if (sayi==0){
            System.out.println("Sayı olarak sıfır girdiniz");
        } else if (sayi%2==0) {
            System.out.println("Girdiğiniz "+sayi+" sayısı bir çift sayıdır");
        } else{
            System.out.println("Girdiğiniz "+sayi+" sayısı bir tek sayıdır");
        }


    }
}
