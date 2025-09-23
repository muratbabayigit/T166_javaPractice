package day05;

import java.util.Arrays;

public class P04_array {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        int dollarSum=0;
        int poundSum=0;

        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i].contains("$")){
                dollarSum+=Integer.parseInt(strArr[i].replace("$",""));
            }else {
                poundSum+=Integer.parseInt(strArr[i].replace("£",""));
            }
        }
        System.out.println("dollarSum = " + dollarSum+"$");
        System.out.println("poundSum = " + poundSum+"£");
    }
}
