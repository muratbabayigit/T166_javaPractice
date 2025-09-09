package day03;

public class P07_forLoop {
    //        1 2 3 4 5 6
    //         2 3 4 5 6
    //          3 4 5 6
    //           4 5 6
    //            5 6
    //             6
//   şeklini konsola yazdiriniz.
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            //satır başındaki boluş miktarı belirlenir ve yazdırılır
            for (int bosluk = 1; bosluk < i; bosluk++) {
                System.out.print(" ");
            }
            //satırda yer alan rakamlar belirlenir ve yazdırılır
            for (int j = i; j <=6 ; j++) {
                System.out.print(j+" ");
            }
            // bir satıra yazdırılacaklar yazırılınca bir sonraki satıra geçme işlemi yapılır
            System.out.println();
        }

    }
}
