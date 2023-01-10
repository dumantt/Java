package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4
        int input;
        int karekok=1;
        boolean sonuc = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kare kökünü almak istediginiz sayiyi giriniz");
        input =scan.nextInt();


        while (karekok*karekok <= input){
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);

        // do while loop ile yapalim
        // Scannersiz dogrudan input ile yapıldı
        input=144;
        karekok=1;
        sonuc=false;
        do {
            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }while(karekok*karekok<=input);
        System.out.println(sonuc);


    }
}
