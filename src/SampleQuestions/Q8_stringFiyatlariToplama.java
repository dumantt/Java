package SampleQuestions;

public class Q8_stringFiyatlariToplama {

    public static void main(String[] args) {

        // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : "15.30 €" , input2 : "11.40 €"
        //output : 26.70 €

        String input1= "15.30 £";
        String input2= "11.40 £";

        double sayi1 = Double.parseDouble(input1.substring(0,input1.length()-1));
        double sayi2 = Double.parseDouble(input2.substring(0,input2.length()-1));
        char birim = input1.charAt(input1.length()-1);
        System.out.println((sayi1+sayi2)+" "+birim);

        /*
        String input1 = "15.3";
        String input2 = "11.40";
        double output = Double.parseDouble(input1)+Double.parseDouble(input2);
        System.out.println(output+" €");
         */






    }
}
