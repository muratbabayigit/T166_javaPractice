package day05;

public class P05_mdArray {
    /*
     * 2 boyutlu bir diziyi kabul eden ve maksimum degerli elemanı bulan bir method yazin
     * Input : {{1,2,3},{4,5},{6,7,8}}
     * Output : 8
     */

    public static void main(String[] args) {
       int [][] input = {{1,2,259,3},{4,5},{6,7,38,8}};
       int enBuyuk=0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j]>enBuyuk){
                    enBuyuk=input[i][j];
            }

            }
        }
        System.out.println("En Buyuk: "+enBuyuk);
    }

}
