package day07_TernaryOperatorsSwitchStatements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        /* kullanıcıdan gün numarası alin
        haftaiçi veya haftasonu olduğunu yazdırın
         */

        int gunNo = 3;
        switch (gunNo){
            case 1 :
                System.out.println("Haftaici");
                break;
            case 2 :
                System.out.println("Haftaici");
                break;
            case 3 :
                System.out.println("Haftaici");
                break;
            case 4 :
                System.out.println("Haftaici");
                break;
            case 5 :
                System.out.println("Haftaici");
                break;
            case 6:
                System.out.println("Haftasonu");
                break;
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
            }

            //bunu şu şekilde kısaca yazabiliriz

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Haftaici");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }


        }
}
