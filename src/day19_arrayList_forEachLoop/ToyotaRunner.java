package day19_arrayList_forEachLoop;

public class ToyotaRunner {

    public static void main(String[] args) {
        Toyota toyota1= new Toyota(); //burada constructor u çağırdık
        System.out.println(toyota1.marka + ", "
                +toyota1.model+", " // bu nokta model ve digerleri Q09 da olusturdugumuz
                +toyota1.yil+", "   // classdan dolayı yapılabiliyor
                +toyota1.km+", "    // biz başta çagirdigimiz içi
                +toyota1.renk);     // kullanbiliyoruz bu şekilde

        // Toyota, Model belirtilmemis, 0, 0, null
        toyota1.model="Corolla";
        toyota1.yil=2020;
        toyota1.km=50000;
        System.out.println(toyota1.marka + ", "
                +toyota1.model+", "
                +toyota1.yil+", "
                +toyota1.km+", "
                +toyota1.renk);
        // Toyota, Corolla, 2020, 50000, null
    }
}