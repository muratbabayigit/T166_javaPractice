package day05;


import java.util.Arrays;
import java.util.Scanner;

public class P01_array {
    public static void main(String[] args) {
        // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
        // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
        // elemaninin arasindaki farki gosteren java programi yazin

        Scanner scan = new Scanner(System.in);
        System.out.print("Oluşturulacak array'in eleman sayısını giriniz: ");
        int arrayUzunluk = scan.nextInt();
        int[] arr = new int[arrayUzunluk];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+".elemanı giriniz: ");
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("---------- Arrays Sıralanmış Hali -----------");
        System.out.println(Arrays.toString(arr));
        int enKucuk=arr[0];
        int enBuyuk=arr[arr.length-1];

        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);
        System.out.println("---- En Büyük Eleman ile En Küçük Eleman Arasındaki Fark ----");
        System.out.println("Sonuç = "+(enBuyuk - enKucuk));

    }
}
