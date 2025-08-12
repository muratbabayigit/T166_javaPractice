package day02;

import java.util.Scanner;

public class P06_ternary {
    public static void main(String[] args) {
        // Kullanıcının girdiği sayı çift ise çift değil tektir yazıran java kodunu yazınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();


        System.out.println(number % 2 == 0 ? "Girdiğiniz sayı çift sayıdır" : "Girdiğiniz sayı tek sayıdır");
    }
}
