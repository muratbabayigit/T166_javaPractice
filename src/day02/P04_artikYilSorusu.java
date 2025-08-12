package day02;

import java.util.Scanner;

public class P04_artikYilSorusu {
    public static void main(String[] args) {

     /*
        Girilen yılın artık yıl olup olmadığını bulunuz
        Şartlar:
        Artık yıl
        4'e bölünen ama 100'e bölünmeyen yıllardır
        100'e bölünen yıllardan aynı zamanda 400' de bölünebilen yıllardır
    */

        //int year=2020;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz yılı giriniz: ");
        int year = scan.nextInt();
        if (year%100==0 && year%400==0){ // 100'e bölünen yıllardan aynı zamanda 400' de bölünebilen yıllardır
            System.out.println(year +"  yılı bir artık yıldır");
        } else if (year%4==0 && year%100!=0) { // 4'e bölünen ama 100'e bölünmeyen yıllardır
            System.out.println(year +"  yılı bir artık yıldır");
        }else{
            System.out.println(year +"  yılı bir artık yıl değildir");
        }


    }
}
