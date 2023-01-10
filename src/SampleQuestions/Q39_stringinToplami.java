package SampleQuestions;

public class Q39_stringinToplami {
    public static void main(String[] args) {

/*
        Soru 34-)
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
        Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
        */
        // bu soruda  digitleri aldım array yaptım ama arraydekileri hiçbir şekilde toplayamadım
        // internetten yardım alarak böyle çözdüm
        // Character.getNumericValue() tekniğini ilk defa gördüm kullanışlıymış

        String str = "a7d3e1r45d3";
        int toplam = rakamlarToplami(str);
        System.out.println("Toplam = " + toplam); // Output: 10
    }

    public static int rakamlarToplami(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                toplam += Character.getNumericValue(c);
            }
        }
        return toplam;
    }
}
