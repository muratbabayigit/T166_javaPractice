package day01;

import java.util.Scanner;

public class P03_kullanicidanDegerAlma {
    public static void main(String[] args) {

        //Soru: kullanıcdan adını soyadını yaşını ve mesleğini sorup aşağıdaki gibi yazdırın
/*
            Adı     : Murat
            Soyadı  : Yiğit
            Yaşı    : 45
            Mesleği : Instructor

 */

        Scanner scan = new Scanner(System.in);  //scan teamül gereğidir. Onun yerine ali bie yazılır murat dahi yazılır
        System.out.print("Adınız: ");
        // String name=scan.next(); scan.next() kullanılırsa sadece ilk kelimenin sonuna kadar alır.
        String name = scan.nextLine();
        System.out.print("Soyadı: ");
        String surname = scan.nextLine();
        System.out.print("Yaşınız: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Mesleğiniz: ");
        String job = scan.nextLine();

        System.out.println("\tAdı: " + name + "\n\tSoyadı: " + surname + "\n\tYaşı: " + age + "\n\tMesleği: " + job);

    }
}
