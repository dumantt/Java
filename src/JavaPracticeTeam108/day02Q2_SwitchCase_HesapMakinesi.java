package JavaPracticeTeam108;

import java.util.Scanner;

public class day02Q2_SwitchCase_HesapMakinesi {
    /*
     * Kullanicidan iki tamsayi sayi ve islem cinsini alin
     * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
     *
     * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
     *
     * Ornek : Inputs : sayilar : 18 , 10  islem : 3
     *         Output : 18 X 10 = 180
     */

    // Bu benim yaptigim switch method

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematiksel isleme sokmak icin ilk tamsayiyi giriniz : ");

        int sayi1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Matematiksel isleme sokmak icin ikinci tamsayiyi giriniz : ");


        int sayi2 = scan2.nextInt();

        System.out.println("Islem turunu seciniz : \n 1 : Toplama\n 2 : Cikarma\n 3 : Carpma\n 4 : Bolme");

        int islem = scan.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("Toplama isleminin sonucu : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma isleminin sonucu : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu : " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bolme isleminin sonucu : " + ((double)sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

        // Bu hocanin yaptigi if ve switch method cozumler

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Matematiksel isleme sokmak icin 2 tane tamsayi giriniz : ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Islem turunu seciniz : \n\t1 : Toplama\n\t2 : Cikarma\n\t3 : Carpma\n\t4 : Bolme");

        int islem = scan.nextInt();

        System.out.println("****************** IF Cozumu ********************");

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a/b);
        }
        else System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");

        System.out.println("****************** Switch Case Cozumu 1 ********************");

        switch (islem) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

        System.out.println("****************** Switch Case Cozumu 2 ********************");

        System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");


        char isaret = scan.next().charAt(0);

        switch (isaret){
            case '+' : System.out.println(a + " + " + b +" = " + (a+b)); break;

            case '-' : System.out.println(a + " - " + b +" = " + (a-b)); break;

            case '*' : System.out.println(a + " * " + b +" = " + (a*b)); break;

            case '/' : if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a + " / " + b +" = " + (a/b)); break;

            default: System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }

        */
    }
}