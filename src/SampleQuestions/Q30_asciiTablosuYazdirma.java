package SampleQuestions;

public class Q30_asciiTablosuYazdirma {
    public static void main(String[] args) {


        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
ipucu: For Loop ve Char kullanarak çözebilirsiniz.
örnek:
Ascii value of a = 97
Ascii value of b = 98
Ascii value of c = 99
Ascii value of d = 100
......

         */

        for (int i = 'a'; i <='a' +25 ; i++) {
            char a = (char)i;
            System.out.println("ascii value of " + a + " = " + i);
        }
    }
}
