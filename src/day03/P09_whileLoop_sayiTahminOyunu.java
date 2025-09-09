package day03;

import java.util.Random;
import java.util.Scanner;

public class P09_whileLoop_sayiTahminOyunu {
    public static void main(String[] args) {
           /*
        Kullanıcıdan 1 ila 100 arasında tahmin yapıp belirlenen sayıyı bulup bulmadığını kontrol eden
        bulursa tebrikler bildiniz desin. tahmin hakkı 5 olmak üzere bilemediğinde
        üzgünüm bilmediniz ve 1 tahmin hakkınız kaldı desin
            */

        Scanner scan=new Scanner(System.in);
        //int sayi=97;
        Random random=new Random();
        int sayi=random.nextInt(1,100);
        System.out.println("Aklımdan 1 ila 100 arası bir sayı tuttum. Tahmin Et!\n Unutma 5 hakkın Var!");

        int tahmin=0;
        int tahminHakki=5;
        int tahminSayisi=1;

        while(tahminHakki>0){
            System.out.print(tahminSayisi+". tahmininiz: ");
            tahmin=scan.nextInt();

            if (tahmin==sayi){
                System.out.println("Tebrikler "+tahminSayisi+".tahmininizde doğru sayıyı buldunuz.");
                break;
            } else if (tahmin>sayi) {
                System.out.println("Maalesef fazla söylediniz tekrar deneyiniz");
            }else{
                System.out.println("Maalesef az söylediniz tekrar deneyiniz");
            }
            tahminHakki--;
            tahminSayisi++;

            if (tahminHakki>0){
                System.out.println("Dikkat "+tahminHakki+" tahmin etme hakkınız kaldı!");
            }else{
                System.out.println("Tüm tahmin haklarınızı tamamladınz! Doğru cevap: "+sayi+" olmalıydı. Üzgünüm, yine bekleriz :)");
            }
        }

    }
}
