package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa

        // Bu ben if ile yaptim hoca turnary ile yapmisti if ile de yapilabilir demisti

        String input = "Java candir, Selenium heyecandir";
        for (int i =0; i<input.length(); i++){
            if (i%2==0) System.out.print (input.substring(i,i+1).toUpperCase());
            else System.out.print(input.substring(i,i+1).toLowerCase());
                 }
        /*
        String input= "Java candir, Selenium heyecandir";
        for (int i = 0; i <input.length() ; i++) {
            System.out.print  ( i%2==0   // index cift mi ?
                    ? input.substring(i,i+1).toUpperCase() // index cift ise
                    : input.substring(i,i+1).toLowerCase() // index cift degilse
            );                                             // TURNARY ile yaptik
        }

         */
    }
}
