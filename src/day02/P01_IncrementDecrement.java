package day02;

public class P01_IncrementDecrement {

    public static void main(String[] args) {


        int a=120;

        System.out.println(a+10); //130
        System.out.println(a); //120

        a-=10;
        System.out.println(a); //110

        a/=5;
        System.out.println(a);

        int b=85;
        //predecrement
        int c=--b; // b değerini 1 azaltarak hem c hem de b'ye ata
        System.out.println("b = " + b); // 84
        System.out.println("c = " + c); // 84

        //PostIncrement
        int d=125;
        int e=d++;
        System.out.println("d = " + d); //126
        System.out.println("e = " + e); //125


    }
}
