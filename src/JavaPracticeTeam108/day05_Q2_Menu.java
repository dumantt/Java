package JavaPracticeTeam108;

public class day05_Q2_Menu {

    public static void main(String[] args) {

        // create 2D array of food:
        // print all the foods sorted


        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */

        System.out.println("======================= For each Cozumu ====================");

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulkeler : food) {

            for (String yemek : ulkeler) {

                System.out.println(yemek);

            }
            System.out.println("-----------------------");
        }

        System.out.println("======================= For i Cozumu ====================");

        // ülke ismi ekleyerek yapıyoruz

        String[] ulkeler ={"american","italian","asian","afghani","indian"};

        for (int i = 0; i < food.length; i++) {

            System.out.println("----------- " + ulkeler[i] + " ------------" );

            for (int j = 0; j < food[i].length ; j++) {
                System.out.println(food[i][j]);
            }
        }
    }
}