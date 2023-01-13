package SampleQuestions;

import java.util.Scanner;

public class Q51_Hipotenus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write the Length of the 1st Side of the Right Triangle in cm");
        double side1 = scan.nextDouble();
        System.out.println("Please Write the Length of the 2nd Side of the Right Triangle in cm");
        double side2 = scan.nextDouble();

        HipotenusCalculation(side1,side2);
    }

    private static void HipotenusCalculation(double side1, double side2) {

        double hipotenus =  Math.sqrt((side1*side1) + (side2*side2)) ; // karekök alma methodu Math.sqrt()

        System.out.println("Hipotenus Length = " + hipotenus + "cm" );
    }
}
