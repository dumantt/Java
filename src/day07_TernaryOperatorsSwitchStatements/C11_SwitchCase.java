package day07_TernaryOperatorsSwitchStatements;

public class C11_SwitchCase {
    public static void main(String[] args) {

        /*ISTQB harflerinden hanigisinin açılımını öğrenmek istiyorlarsa onu girmelerini isteyeceğiz.
        I : international , S : software , T : testing , Q : qualifications , B : Board
         */

        char harf = 'i';
        switch (harf) {
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yanlış harf girişi");
        }


    }
}
