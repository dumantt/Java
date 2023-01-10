package day16_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        // verilen bir string array'in tum elementlerini yazdirin

        String[] isimler = {"Huseyin","Yusuf","Mehmet","Akile","Said"};

        System.out.println(Arrays.toString(isimler)); //[Huseyin, Yusuf, Mehmet, Akile, Said]

        // evet degerler zaten String ama array string dagil ayri bir obje onun icin string yapiyoruz

        for (int i = 0; i < isimler.length; i++) {

            System.out.print (isimler[i] + " ");
        }
    }
}
