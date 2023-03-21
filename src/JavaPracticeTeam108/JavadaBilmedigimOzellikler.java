package JavaPracticeTeam108;



public class JavadaBilmedigimOzellikler {

    // getter setter main methoddan once private lar icin yapilabiliyor
    // sag tus generate e tikliyoruz orada constructor test override gibi seylerde cikiyor
    private int abc;
    private String bcd;

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    public String getBcd() {
        return bcd;
    }

    public void setBcd(String bcd) {
        this.bcd = bcd;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        if (a<b)
            System.out.println("dogru");
        else System.out.println("yanlis");

        // if ve ya else den sonra tek satir secenek varsa curly braces a gerek yokmus ama yine de kullanalim tabi

        int count = 0;

        for (count = 1; count<=10; count++){
            if (count==7)
                continue;
            System.out.print(count + ", "); //1, 2, 3, 4, 5, 6, 8, 9, 10,
        }

        // continue bu sekilde calisiyor 7 yi yazdirmadi devam ettirdi





    }

}
