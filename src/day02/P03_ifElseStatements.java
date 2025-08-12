package day02;

import java.util.Scanner;

public class P03_ifElseStatements {
    /* Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin
     * degerini hesaplayin. 55 hiz siniridir.
     * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
     * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
     * Eger Hiziniz 85 - 94 arainda ise: Ceza 320 $'dir.
     * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
     * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
     * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hız değeri alnıyor... :");
        double velocity= scan.nextDouble();
        int ceza;
        
        if(velocity<55){
            ceza=0;
        } else if (velocity>=55 && velocity<=74) {
            ceza=100;
        } else if (velocity>=75 && velocity<=84) {
            ceza=150;
        } else if (velocity>=85 && velocity<=94) {
            ceza=320;
        }else{
            ceza=500;
        }
        System.out.print("Ehliyetiniz varmı? E/H : ");
        String e=scan.next().toLowerCase();
        if(e.equals("h")){
            ceza+=200;
        }
        System.out.println("Hızınızın "+velocity+" olması nedeniyle "+ceza+"$ ceza ile cezalandırıldınız");






    }
}
