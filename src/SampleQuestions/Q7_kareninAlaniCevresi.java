package SampleQuestions;

import java.util.Scanner;

public class Q7_kareninAlaniCevresi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        int kenar = scan.nextInt();

        System.out.println("karenin cevresi : " + 4*kenar);
        System.out.println("karenin alani : " + kenar*kenar);





    }
}
