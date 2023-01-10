package openai;

public class fibonacci {

        // java da fibonacci dizisi kodu yaz
        // Merhaba! Fibonacci dizisi kodunu aşağıdaki gibi yazabilirsiniz:
    public static void main(String[] args) {
         int n = 10, t1 = 0, t2 = 1;
            System.out.print("First " + n + " terms: ");

         for (int i = 1; i <= n; ++i) {
         System.out.print(t1 + " + ");

         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
         }
        // Bu kod, ilk 10 Fibonacci sayısını yazdırır. Eğer farklı bir sayı dizisi istiyorsanız,
        // n değişkenini değiştirerek dizinin kaç elemanlı olacağını belirleyebilirsiniz.
    }
}
