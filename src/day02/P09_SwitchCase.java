package day02;

import java.util.Scanner;

public class P09_SwitchCase {
    public static void main(String[] args) {
        //Kullanıcıdan hafatnında kaçıncı gününde olduğunu alıp o günün adını yazdırın.
        // Yanına da hafta içi ise iyi çalışmalar, haftasonu ise iyi tatiller desin


        Scanner scan=new Scanner(System.in);
        System.out.print("Bugün haftanın kaçıncı günü: ");
        int sayi= scan.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Bugün pazartesi, iyi çalışmalar");
                break;
            case 2:
                System.out.println("Bugün salı, iyi çalışmalar");
                break;
            case 3:
                System.out.println("Bugün çarşamba, iyi çalışmalar");
                break;
            case 4:
                System.out.println("Bugün perşembe, iyi çalışmalar");
                break;
            case 5:
                System.out.println("Bugün cuma, iyi çalışmalar");
                break;
            case 6:
                System.out.println("Bugün cumartesi, iyi tatiller");
                break;
            case 7:
                System.out.println("Bugün pazar, iyi tatiller");
                break;
            default:
                System.out.println("1-7 arası bir rakam girmeliydiniz. Hatalı giriş yaptınız");

        }
    }
}
