package day05;

public class P03_array {
   static int istenenEleman=28;

    /*
     * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {

        toplamiIncele();

    }

    public static void toplamiIncele() {
        int sayac=0;
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == istenenEleman) {
                    System.out.println(arr[i] +" ile " +arr[j] + " toplamı "+(arr[i]+arr[j])+"'dur");
                    sayac++;
                }

            }
        }
        System.out.println("------------------- Bilgilendirme -----------------");
        if (sayac>0){
            System.out.println("Toplamları "+istenenEleman+" olan "+sayac+" adet ikili vardır.");
        }else{
            System.out.println("Toplamları "+istenenEleman+" olan ikili bulunamamıştır");
        }

    }
}
