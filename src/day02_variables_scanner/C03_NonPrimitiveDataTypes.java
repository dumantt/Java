package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String str= "Java Candir";
        int sayi= 10;
        System.out.println(sayi); // 10
        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str); // Java Candir
        System.out.println(str.toUpperCase()); // JAVA CANDİR
        // primitive data türlerinin onceden hazirlanmis methodlari yoktur
        // ancak non-primitive data türlerinin onceden hazırlanmış bizim kullanabileceğimiz methodları olur
        System.out.println(str.isEmpty()); // false
    }
}
