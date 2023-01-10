package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {


        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin
        int sayilarinToplami=0;
        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i + " ");   // <<< buradaki sout a ln yazmadik cok uzun olacagi icin
                                         // sadece sonuctan önce bir daha sout yazdik ln li

            // sayilarinToplami= sayilarinToplami+i;  >>> alt satirdaki kodla ayni işleve sahip ama alttaki tercih ediliyor
            sayilarinToplami +=i;
        }

        System.out.println(" "); // >>> yukaridaki sout da ln yazdirmadigimiz icicn yan yana yaziyordu
                                 // sonuc direk alt satirda ciksin basta hemen gorelim diye bunu buraaya ekledik
        System.out.println("tum bu sayilarin toplami = " + sayilarinToplami);

    }
}
