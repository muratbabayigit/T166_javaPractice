package day03;

public class P03_Stringmanipulation_ValueOf {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.
        System.out.println(paraErkek + paraKadin);//19002000
        System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));//3900

        int maasErkek = 1900;
        int maasKadin = 2000;

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin
        System.out.println(maasErkek + maasKadin);//3900
        System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000


        String girilenKelime = "65"; // su haliyle ahmet gibi bir kelimedir.sayisal isleme giremez
        int girilenSayi = 65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);

        // sayinin -> kelimeye cevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // degiskenin tipine uygun donusum
        String kelimeOran = Double.toString(oran);
        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.




           /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		         1) \\d    ==> tum rakamlar         0->9
		          	 \\D    ==> tum rakam dışı character ler  0->9    _ disindaki hersey
		         2) \\w   ==> A->Z		a->z
		         	 \\W  ==> A->Z		a->z		tum harf disi character ler
		         3) \\s   ==> space
		         	 \\S   ==> space disindaki hersey

         */
    }
}