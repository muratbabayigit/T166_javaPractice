package day03;

import org.w3c.dom.events.MutationEvent;

public class P01_stringManipulation {

    public static void main(String[] args) {

        String metin="Have a nice day 8";

        //indexOf
        System.out.println(metin.indexOf('a')); // 1
        System.out.println(metin.indexOf('e')); // 3
        System.out.println(metin.indexOf('i')); // 8
        System.out.println("-----------------------------------------------");
        //lastindexOf
        System.out.println(metin.lastIndexOf('a')); // 13
        System.out.println(metin.lastIndexOf('e')); // 10
        System.out.println(metin.lastIndexOf('i')); // 8


        //substring
        System.out.println(metin.substring(0,4)); //Have
        System.out.println(metin.substring(7,11)); //nice
        System.out.println(metin.substring(7)); //nice day

        //replaceAll
        System.out.println(metin.substring(0,1)+metin.substring(1).replaceAll("\\w","*"));
        System.out.println(metin.substring(0,1)+metin.substring(1).replaceAll("\\s","-"));

        //contains, eqauls, equalsIgnoreCase
        System.out.println(metin.contains("e")); // true
        System.out.println(metin.contains("s")); // false

        String isim="arda";
        String isim2="Arda";
        System.out.println(isim.equals(isim2)); // false
        System.out.println(isim.equals(isim2.toLowerCase())); // true
        //yukarıdaki satırda önce isim2 variable'nın değerini tamamen küçük harf yapıp isim variable'ı ile eşit mi diye bakıyor
        System.out.println(isim.equalsIgnoreCase(isim2)); // true
        //yukarıdaki satırda ise isim ve isim2 variable'larının eşitliğine büyük harf küçük harf durumlarını dikkate almayarak bakıyor

        // Concatination
        String dosyaNo="20251003";
        int number=1;
        System.out.println(number); //
        String ogrNo="";
        System.out.println(ogrNo+dosyaNo+number); // 202510031
        number++;
        System.out.println(ogrNo+dosyaNo+number);  //202510032
        number++;
        System.out.println(ogrNo+dosyaNo+number); //202510033
        String name="Murat";
        System.out.println(10+20+name); //30Murat
        System.out.println(name+10+20); //murat1020 STRING-STRONGDUR
        int sayi=30;
        String sayi2=30+"";
        System.out.println(sayi+sayi2);















    }
}
