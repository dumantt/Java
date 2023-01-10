package day02_variables_scanner;

public class C01_variables {
    /*
    Java'da kodlarimizi classlarda olustururuz
    Classlar ihtiyac duyulduğunda obje olusturmak ıcın kullanılır
    Java'nin baslangıc noktası (entry poınt) maın method'dur
    Variable'lari datalarımizi saklamak (store) icin olustururuz
     */
    public static void main(String[] args) {
        System.out.println("Java Candır");
        /*
        tam sayı int
        metinsel ifadeler String
        Strıng            ogrenciIsmi            =                    "Matrix         . "    ;
        Data turu         variable ismi      assingment (atama)        deger                 ;
         */

        String ogrenciIsmi= "tahir";
        System.out.println(ogrenciIsmi);
        ogrenciIsmi= "Talha";
        System.out.println(ogrenciIsmi);
    }
}
