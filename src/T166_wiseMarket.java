import java.time.LocalDateTime;
import java.util.Scanner;

public class T166_wiseMarket {

  /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince fiş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin

    */

    static Scanner scan = new Scanner(System.in);
    static int secim = 0;
    static boolean ekUrun=false;
    static int urunkodu;
    static int urunMiktari;
    static String urunAdi;
    static double urunFiyat;
    static double toplamTutar=0;
    static String sepet="";
    static double paraUstu;
    static double eksikKalan;











    public static void main(String[] args) {
        girisEkrani();
    }


    public static void girisEkrani() {
        System.out.println("====================  WISE MARKET KASA PROGRAMI ===================================");
        System.out.println("==================== Menüden Seçiminizi Yapınız ===================================");
        System.out.println("\t1-Şarküteri Reyonu\n\t2-Manav Reyonu\n\t3-Market Reyonu\n\t4-Fiş Yazdır\n\t5-İptal Et/Çıkış");
        System.out.println();
        System.out.print("Seçiminiz: ");
        secim = scan.nextInt();

        if (secim < 1 || secim > 5) {
            System.out.println("Yanlış seçim yaptınız. Yeniden giriş yapınız");
            girisEkrani();
        } else {

            switch (secim) {
                case 1: sarkuteri(); break;
                case 2: manav(); break;
                case 3: market(); break;
                case 4: fisYazdir(); break;
                case 5: quit(); break;
                default:

            }

        }


    }

    public static void sarkuteri() {
        System.out.println("==================  ŞARKÜTERİ REYONUNA HOŞGELDİNİZ ===============================");
        System.out.println("============== Menüden Alacağınız Ürün Kodunun Seçimini Yapınız ==============");
        System.out.println("\t101- Peynir 1kg paket 200₺\n\t102- Yumurta 1 koli 100₺\n\t103- Yoğurt 1 kg 60₺\n\t" +
                "104- Pastırma 1 paket(100gr) 250₺\n\t105- Sucuk 1 kangal 550₺");


        while(!ekUrun){
            System.out.print("Ürün Kodu: ");
            urunkodu= scan.nextInt();

            if (urunkodu>=101 && urunkodu<=105){
                System.out.print("Kaç paket alacakasınız: ");
                urunMiktari= scan.nextInt();

                switch (urunkodu){
                    case 101: urunAdi="Peynir"; urunFiyat=250; break;
                    case 102: urunAdi="Yumurta"; urunFiyat=100; break;
                    case 103: urunAdi="Yoğurt"; urunFiyat=60; break;
                    case 104: urunAdi="Pastırma"; urunFiyat=250; break;
                    case 105: urunAdi="Sucuk"; urunFiyat=550; break;
                }
                System.out.println(urunMiktari+" paket "+urunAdi+" : "+(urunFiyat*urunMiktari)+"₺");
                toplamTutar+=(urunFiyat*urunMiktari);
                sepet+=urunAdi+"     "+urunMiktari+"                  "+(urunFiyat*urunMiktari)+"₺\n";

                System.out.println("Toplam Alışveriş Tutarı: "+toplamTutar+"₺");
                System.out.println("Bu reyondan başak bir ürün almak ister misiniz?\nİstiyorsanız ürün kodunu giriniz\nAna Menüye dönmek için ürün kodu olarak 0 tuşuna basınız");

            } else if (urunkodu==0){
                girisEkrani();
            }


        }

    }

    private static void manav() {
        System.out.println("==================  MANAV REYONUNA HOŞGELDİNİZ ===============================");
        System.out.println("============== Menüden Alacağınız Ürün Kodunun Seçimini Yapınız ==============");
        System.out.println("\t201- Elma 1kg 59.90₺\n\t202- Muz 1 kg 89.90₺\n\t203- Havuç 1 kg 30₺\n\t" +
                            "204- Ananas 1 paket 120₺\n\t205- Mangostan 1 kg 150₺");


        while(!ekUrun){
            System.out.print("Ürün Kodu: ");
            urunkodu= scan.nextInt();

            if (urunkodu>=201 && urunkodu<=205){
                System.out.print("Kaç paket alacakasınız: ");
                urunMiktari= scan.nextInt();

                switch (urunkodu){
                    case 201: urunAdi="Elma"; urunFiyat=59.90; break;
                    case 202: urunAdi="Muz"; urunFiyat=89.90; break;
                    case 203: urunAdi="Havuç"; urunFiyat=30; break;
                    case 204: urunAdi="Ananas"; urunFiyat=120; break;
                    case 205: urunAdi="Mangostan"; urunFiyat=150; break;
                }
                System.out.println(urunMiktari+" paket "+urunAdi+" : "+(urunFiyat*urunMiktari)+"₺\n");
                toplamTutar+=(urunFiyat*urunMiktari);
                sepet+=urunAdi+"     "+urunMiktari+"                  "+(urunFiyat*urunMiktari)+"₺";

                System.out.println("Toplam Alışveriş Tutarı: "+toplamTutar+"₺");
                System.out.println("Bu reyondan başak bir ürün almak ister misiniz?\nİstiyorsanız ürün kodunu giriniz\nAna Menüye dönmek için ürün kodu olarak 0 tuşuna basınız");

            } else if (urunkodu==0){
                girisEkrani();
            }


        }
    }

    private static void market() {




    }

    private static void fisYazdir() {

        System.out.println("---------------------------- T166 WISE MARKET ----------------------------");
        System.out.println("-----------------------------  Hoşgeldiniz  ----------------------------");
        System.out.println();
        System.out.println();
        System.out.println(sepet);
        System.out.println();
        System.out.println("KDV : "+(toplamTutar*0.18)+"₺");
        System.out.println("Ödenecek Tutar : "+(toplamTutar+toplamTutar*0.18)+"₺ KDV Dahil");
        System.out.println("Ödenen Tutar: ");
        int odemeMiktari= scan.nextInt();
        if (odemeMiktari>(toplamTutar+toplamTutar*0.18)){
           paraUstu=odemeMiktari-(toplamTutar+toplamTutar*0.18);
            System.out.println("Para üstü: "+paraUstu);

        }else{
            eksikKalan=(toplamTutar+toplamTutar*0.18)-odemeMiktari;
            System.out.println("Verilen miktar tutarı karşılamıyor.\n"+eksikKalan+" kadar ödeme yapmalısınız");
        }
        System.out.println("Bizi tercih ettiğiniz için teşekkürler\n Yine Bekleriz\n\n");
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        quit();

    }

    private static void quit() {
        System.out.println("......Çıkış yapılıyor");
        System.exit(0);
    }
}
