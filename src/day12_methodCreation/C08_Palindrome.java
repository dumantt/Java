package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Verilen bir stringin Palindrome olup olmadigini yazdirin
        //Palindrome düz ve ters okunusu birbirine ayni olan demek

        String str = "ey edip adanada pide ye";

        String tersStr = C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){  // case sensetive equals kodu
            System.out.println("Verilen metin Palindrome");
        } else {
            System.out.println("Verilen metin Palindrome degil");
        }
    }
}
