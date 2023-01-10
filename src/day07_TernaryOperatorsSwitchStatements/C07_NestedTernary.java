package day07_TernaryOperatorsSwitchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {
        //Nested içi içe ternary üçlü
        // Kullanicidan bir tamsayi alin.
        //  Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //  Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
        int sayi= 23;
        // System.out.println(sayi>0 ? "sayi pozitif" : "sayi pozitif degil");
        System.out.println(sayi>0
                ?
                sayi%2==0 ? "cift sayi" : "tek sayi"
                :
                -100>=sayi && sayi>=-999 ? "3 basamakli" : "# basamakli degil"
                );
        // tek satır olarak yazılmış hali birebir aynı tek satıra yazılmış aynı şekilde çalışıyor
        System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi" : "tek sayi" :-100>=sayi && sayi>=-999 ? "3 basamakli" : "# basamakli degil");
    }
}
