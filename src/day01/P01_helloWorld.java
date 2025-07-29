package day01;

public class P01_helloWorld {
/*
        SORU 1: Aşşağıdaki ifadelerin her birini tek bir satır kod içine yazarak konsola yazdırınız

          A)  Hello World            B)  a=3            C) Hello                 World


*/

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.err.println("Hello World");
        System.out.println();
        int a=3;
        System.out.println("a=" + a);
        System.out.println("Hello                  World");
        System.out.println("Hello\t\t\t\t   World");

        System.out.println();
        //Soru tek bir System.out.println() içinde aşağıdaki yazıyı olduğu şekilde yazdırın

        // Hello World      "Hello World"

        System.out.println("Hello World\t\t\"Hello World\"");
        System.out.println("Hello World     "+"\"Hello World\"" );
        System.out.println("Hello World     \"Hello World\"");


/*
    \t : bir TAB tuşu kadar boşluk bırakır
    \" : " ifadesini metin olarak algılar
    \n : n harfinden sonra gelen kısmı bir alt satırdan yazıdırır

*/
        /*
                    Hello
                        World
         */
        System.out.println("Hello" +
                "               World");
        System.out.println("Hello\n\tWorld");





    }

}
