package day02;

import java.util.Scanner;

public class P07_ternary {
    /*
Bir e-ticaret sitesinde sipariş veren müşterinin sipariş tutarını girerek kargo ücretini hesaplayan bir Java programı yazınız.
    Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
    Eğer sipariş tutarı 500 TL’nin altında ise:
    VIP müşteri olup olmadığı kontrol edilir.
    VIP müşteri ise kargo ücreti 10 TL.
    VIP müşteri değilse kargo ücreti 30 TL.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sipariş Tutarı: ");
        int tutar = scan.nextInt();
        int cargoPrice;
        System.out.println("WiseKart var mı? E/H :");
        char wk = scan.next().toLowerCase().charAt(0);
        cargoPrice = wk == 'e' ? 10 : 30;
        System.out.println(tutar >= 500 ? "kargo ücretsiz kampanyamızdan yararlandınız" : "\nÖdenecek Tutar :" + (tutar + cargoPrice));


    }
}
