package day01;

import javax.swing.*;

public class P04_kullanicidanDegerAlma {
    public static void main(String[] args) {
        /*
            Adı     : Murat
            Soyadı  : Yiğit
            Yaşı    : 45
            Mesleği : Instructor


 */

        String name= JOptionPane.showInputDialog("Adınız: ");
        String surname= JOptionPane.showInputDialog("Soyadınız: ");
        String age=JOptionPane.showInputDialog("Yaşınız: ");
        String job=JOptionPane.showInputDialog("Mesleğiniz: ");


        System.out.println("\tAdı: "+name+"\n\tSoyadı: "+surname+"\n\tYaşı: "+age+"\n\tMesleği: "+job);



    }
}
