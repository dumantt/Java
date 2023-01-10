package JavaPracticeTeam108;

public class day01_Q1_Print {
    public static void main(String[] args) {

        System.out.println("\"Hello \"\\ /' World'\"");

        System.out.print("tahir");
        System.out.print("talha");
        // aynı satıra yazacak

        System.out.println("tahir");
        System.out.println("talha");
        // alt alta yazdıracack


        /*
    Konsolda :

    "Hello "\
    / 'World'"

    yazdiriniz.

         */

    /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */




            System.out.print("Ayse");
            System.out.print("Busra");

            System.out.println();
            System.out.println("Ayse");
            System.out.println("Busra");


            String isim = "Ahmet";
            System.out.println(isim);
            System.out.println("Ahmet"); // Ahmet
            System.out.println("n"); // n
            System.out.println("\n");
            System.out.println("n");

        /*
          "Hello "\
          / 'World'"
        */
            System.out.println("\"Hello \"\\\n/ 'World'\"");
            System.out.println('\'');

         /*         ODEV
        ************************************
                "ATM'ye Hosgeldiniz"

             1- Bakiye Sorgulama
             2- Para Yatirma
             3- Para Cekme
             4- Menu'den Cikis

        *************************************
         */

        System.out.println("************************************\n \"ATM'ye Hosgeldiniz\"\n \n 1- Bakiye Sorgulama \n 2- Para Yatirma \n 3- Para Cekme \n 4- Menu'den Cikis \n \n ************************************* ");

        // bu benim yaptığım

            System.out.println("************************************" +
                    "\n\t\t\"ATM'ye Hosgeldiniz\"\n\n\t" +
                    "1- Bakiye Sorgulama\n\t" +
                    "2- Para Yatirma\n\t" +
                    "3- Para Cekme\n\t" +
                    "4- Menu'den Cikis\n\n" +
                    "************************************");
            //bu hocanın yaptıgı


        }

    }

