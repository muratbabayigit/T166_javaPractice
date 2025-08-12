package day02;

import java.util.Scanner;

public class P05_nestedIfElse {
   static  Scanner sc=new Scanner(System.in);
    /*
    Bir e-ticaret sitesinde sipariş veren müşterinin kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL’nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
*/
    public static void main(String[] args) {
        int tutar =300;
        int cargoPrice;
        if (tutar>=500){
            System.out.println("kargo ücretsiz kampanyamızdan yararlandınız");
        }else {
            System.out.println("WiseKart var mı? E/H: ");
            char wk=sc.nextLine().toLowerCase().charAt(0);
            if (wk=='e'){
                cargoPrice=10;
            }else {
                cargoPrice=30;
            }
            System.out.println("Kargo Ücreti: "+cargoPrice+"₺");
        }

    }
}
