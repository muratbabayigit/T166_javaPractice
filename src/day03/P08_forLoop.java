package day03;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {
         /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


               şeklini konsola yazdiriniz.
     */
        Scanner sc = new Scanner(System.in);
        System.out.print("Piramidin satır yğkleksikliğini giriniz: ");
        int n = sc.nextInt();

        // Satır 1'den itibaren yazmaya başlayalım

        for (int i = 1; i <=n ; i++) {
        
            //boşlukları yazdıralım
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            // yıldızları yazdıralım
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            //bir sonraki satıra geçiş
            System.out.println();

        }
    }
}
