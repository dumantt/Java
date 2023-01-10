package SampleQuestions;

import java.util.Arrays;

public class Q40_stringiCharReturnYapma {
    public static void main(String[] args) {

        /*
        Soru 35-)
        Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
                --> toCharArray() yöntemini kullanmayın
        Örnek:
        String isim:    Yakup
        char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
        */

        String isim =  "Yakup";
        arrayYapici(isim);
    }
    private static String arrayYapici(String isim) {
        Character [] arr = new Character[isim.length()];

        for (int i = 0; i < isim.length(); i++) {
            arr[i] = isim.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        return isim;
    }
}
