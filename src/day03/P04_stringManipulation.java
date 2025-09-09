package day03;

public class P04_stringManipulation {
    public static void main(String[] args) {
         /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str1= %13.99
        String  str2= %10.55
      */

        String  str1= "%13.99";
        String  str2= "%10.55";

        System.out.println(Double.parseDouble(str1.substring(1)));
        System.out.println("toplam: "+(Double.parseDouble(str1.substring(1))+Double.parseDouble(str2.substring(1))));





    }
}
