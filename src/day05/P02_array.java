package day05;

import java.util.Arrays;

public class P02_array {
    //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6

    public static void main(String[] args) {
        isaretDegistir();

        }

    public static void isaretDegistir() {
        int [] arr = {1,-15,32,-56,132,-172,-483,869};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
        arr[i]*=-1;
    }
        System.out.println("------- Hokuuus Pokuuus -------");
        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(arr));
}
    }