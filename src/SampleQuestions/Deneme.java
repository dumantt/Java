package SampleQuestions;

public class Deneme  {
            String name = "Alex";

            public static void main(String[] args) {
                Deneme MyObject = new Deneme();
                MyObject.name = "Carlos" ;
                System.out.println(MyObject.name);
                Deneme2(MyObject.name);
                System.out.println(MyObject.name);
                }

    public static void Deneme2(String name) {
                name = "mertens";
        System.out.println(name);
    }
}