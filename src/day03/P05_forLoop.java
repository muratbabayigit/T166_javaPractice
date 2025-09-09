package day03;

public class P05_forLoop {
    public static void main(String[] args) {


        //SORU: 0'dan 1000'e kadar(1000 dahil) 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (küçükten büyüğe).
        int toplam=0;
        String numbers="";
        for (int i = 1; i <= 1000; i++) {
            if (i%13==0){
                numbers+=i+"-";
                toplam+=i;
            }


        }
        System.out.println(numbers.substring(0,numbers.length()-1));
        System.out.println("Toplam= "+toplam);

    }
}
