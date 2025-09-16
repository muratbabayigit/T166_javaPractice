package day04;

import java.util.Scanner;

public class P01_whileLoop {

    //while loop döngü sayısı belli olmayan durumlar için kullanılır.
    // while Loop bir koşul belirlenir ve o koşul gerçekleşene kadar döngü devam eder

    // Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
    // indexi çift sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazınız: ");
        String kelime = scan.next();
        int index = 0; //0.index bakılması isteneilmezse atama olarak 1 girilir ve 1. index'ten başlar

        while (index < kelime.length()){

            if (index%2==0){
                System.out.println(index+".index :"+kelime.charAt(index));
            }
            index++;
        }


    }
}
