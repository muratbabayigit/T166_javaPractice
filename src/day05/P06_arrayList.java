package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class P06_arrayList {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> list2=new ArrayList<>();

        for(String s: list1){
            if (!s.toLowerCase().contains("a")){
                list2.add(s);
            }

        }
        //System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(list2);

    }
}
