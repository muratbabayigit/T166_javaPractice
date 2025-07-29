package day01;

public class P06_Operatorler {
    public static void main(String[] args) {

        /*       Matematiksel Operatörler
            + : Toplama
            - : Çıkarma
            * : Çarpma
            / : Bölme
            % : Modulus( solundaki sayının sağındaki sayıya bölümünden kalanın kaç olduğunu bulur)

            Koşul Operatörleri
            && : ve Operatoru ( sağındaki ve solundaki koşulun ikisi de doğru olmalıdır
            ||  : veya operatorü (sağındaki ya da solundaki koşulun birinin doğru olması yeterli)
            == : eşittir operatörü( sağının soluna eşit olmasına bakar
            != : eşit değildir operatörü
            =  : atama operatörüdür (soldaki değeri sağdaki variabke'a değer olarak atar)

 */

        int a = 3;   // = : atama operatörüdür

        int b = 4;  // b == a   == : bu eşitliğin sağ tarafı ile sol tarafının eşit olduğunu söyler

        // % : modulus - bu operatörün solundaki sayının sağındaki sayıya bölümünden kalanı verir
        System.out.println(18 % 7);

        // 4 işlemin operatörleri aynı işlevi görecektir.

        // && : ve operatörüdür. Mantıksal işlemleri birleştirir. yanı sağındaki ve solundaki koşulun aynı anda doğru olmasını ifade eder
        // || : veya  operatörüdür. Mantısal işlemleri birleştirir. yanı sağındaki ve solundaki koşulun herhangi birinin doğru olmasını ifade eder

    }
}
