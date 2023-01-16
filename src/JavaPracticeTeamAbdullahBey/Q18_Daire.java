package JavaPracticeTeamAbdullahBey;

import java.util.Scanner;
public class Q18_Daire implements Q18_IIslemler {
    Scanner scan=new Scanner(System.in);
    int r=0;
    @Override
    public void alan() {
        System.out.println("Dairenin yarıçapını giriniz: ");
        r=scan.nextInt();
        System.out.println("Alan: "+(3.14*r*r));

    }

    @Override
    public void cevre() {
        System.out.println("Çevre: "+(2*r*3.14));
    }
}
