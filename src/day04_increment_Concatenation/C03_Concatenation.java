package day04_increment_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String str1 = ""; // içi tamamen boş
        String str2 = " "; //boşluk işaerti var
        String str3 = "-"; // eksi işareti var

        System.out.println(a+b); //30

        System.out.println(str1+a+b); //1020 matematiksel islem yapmadı yazı gibi ekledi

        System.out.println(a+str2+b);  // 10 20  10 ile 20 arasında boşluk var

        System.out.println(a+b+str3);  // 30-  yani işlem şu şekilde oldu 10 +20 + -

        System.out.println(str1+a*b); //  200  yani işlem şu şekilde oldu  hiçlik + 10*20

        System.out.println(str2+(a+b)); //30 yani işlem şu şekilde oldu  boşluk + (10+20)

        /* System.out.println(str1-a);  bu kod çalışmaz
        çünkü string de sadece toplama işlemi yapılır
        yapılan işlemde matematiksel toplama gibi değil yanına yazma zaten
               */

        String x = "Hello";
        String y = "World";
        int z =2;
        int q =3;
        System.out.println(x+ " " + y); // Hello World

        System.out.println(x+y+z+q); // HelloWorld23
        System.out.println(z+q+x+y); //5HelloWorld
        // önce matematiksel işlem varsa matematik önce strig varsa sonrası hep string gibi matematik yok


        System.out.println(x+y+(z+q)); // HelloWorld5




    }
}
