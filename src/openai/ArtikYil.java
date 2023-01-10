package openai;

public class ArtikYil {
    public static void main(String[] args) {

        // java da ay ve yil verildiginde ayın kaç gün oldugunu hesaplayan kod yaz

        int year = 2020;
        int month = 2;

        // Ayın kaç gün olduğunu hesaplayan kod
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int numDaysInMonth = 0;
        if (month == 2) {
            numDaysInMonth = isLeapYear ? 29 : 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            numDaysInMonth = 31;
        } else {
            numDaysInMonth = 30;
        }

        System.out.println(year + " yılının " + month + ". ayı " +
                numDaysInMonth + " gündür.");

        // Bu kod, year ve month değişkenlerine verilen yıl ve ay değerlerine göre
        // ayın kaç gün olduğunu hesaplar ve sonucu ekrana yazdırır.
        // Eğer farklı bir yıl veya ay değeri kullanmak istiyorsanız,
        // bu değişkenleri değiştirerek kodu kendinize göre özelleştirebilirsiniz.
    }
}
