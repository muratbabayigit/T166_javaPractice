package day01;

import java.util.Scanner;

public class T01_Odev {
        /*
    Ödev2: Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        ******       KAYIT BAŞARILI      ******
            Adınız: Tarık
            Soyadınız: Yiğit
            Yaşınız:44
            Mail Adresiniz:tarik@yigit.com.tr
            Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

    */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Sizden istenilen bilgileri giriniz ve enter tuşuna basınız!");
            System.out.print("Adınız: ");
            String name=scan.nextLine();
            System.out.print("Soyadınız: ");
            String surname=scan.nextLine();
            System.out.print("Yaşınız: ");
            int age=scan.nextInt();
            scan.nextLine();
            System.out.print("Email Adresiniz: ");
            String email=scan.nextLine();
            System.out.print("Şifreniz: ");
            String password=scan.nextLine();

            System.out.println("\n******       KAYIT BAŞARILI      ******\n\tAdınız: "+name+"\n\tSoyadınız: "+
            surname+"\n\tYaşınız: "+age+"\n\tMail Adresiniz: "+email+"\n\tŞifreniz: "+password+"\n" +
                    "şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");







        }

}
