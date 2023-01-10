package JavaPracticeTeamAbdullahBey;

public class cozum {
    public static void main(String[] args) {

        //1-100 ARASINDAKİ MÜKEMMEL SAYILARI BULAN METODU YAZINIZ


        int toplam=0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j == 0) {
                    toplam+=j;
                }
            }
            if (toplam==i)
                System.out.println(i+" mükemmel sayıdır");
            toplam=0;
        }

    }
}
