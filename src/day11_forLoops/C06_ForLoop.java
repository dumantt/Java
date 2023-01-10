package day11_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // interviewlerde sorulan sorulardanmis
        // Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
        //       1’den baslayarak tum tamsayilari yazdirin, sira
        //  - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //  - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //  - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int bitisSayisi = scan.nextInt();

        for (int i = 1; i<=bitisSayisi; i++){
        if (i%3==0 && i%5==0) System.out.println("fizzbuzz");
        // daha fazla kesiseni önce yaziyoruz yoksa önceki kesismelerinden dolayi bu kümeye giremez
        // buraya 3 ve 5 e bolunebilme yerine 15 e bolunebilme olarak kısaltabiliriz
        // ama methodlu calisma ve isteneni yapma onemli oldugu icin boyle yazmak daha iyi

        else if (i%3==0) System.out.println("fizz");
        else if (i%5==0) System.out.println("buzz");
        else System.out.println(i + " ");

        }





        /*
        int input= 153;
        for (int i = 1; i <=input ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzBuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            }else System.out.print(i +" ");
        }

         */
    }
}
