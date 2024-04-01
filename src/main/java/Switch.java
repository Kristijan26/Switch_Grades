import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        double max = 0, bodovi = 0, procent = 0;
        Scanner tastatura = new Scanner(System.in);

        System.out.println("Vnesete go maksimalniot broj na bodovi na testot");
        max = tastatura.nextDouble();

        System.out.println("Vnesete go brojot na bodovi koi gi dobil studentot");
        bodovi = tastatura.nextDouble();
        procent = bodovi / max * 100;

        if (bodovi > max) {
            System.out.println("Studentot gi nadminal standardite, no za zal tolko poeni ne moze da dobie");
            System.exit(0);
        }

        procent = bodovi / max * 100;
        int ocenka;

        // Пресметка на оценката со помош на switch изрази
        switch ((int) ((procent - 50) / 10) + 5) {
            case 5:
                ocenka = 5;
                break;
            case 6:
                ocenka = 6;
                break;
            case 7:
                ocenka = 7;
                break;
            case 8:
                ocenka = 8;
                break;
            case 9:
                ocenka = 9;
                break;
            case 10:
                ocenka = 10;
                break;
            default:
                ocenka = -1; // Неопределена оценка
        }

        // Испечатување на оценката на студентот со switch
        switch (ocenka) {
            case 5:
                System.out.println("Studentot padnal");
                break;
            case 6:
                System.out.println("Studentot dobil 6");
                break;
            case 7:
                System.out.println("Studentot dobil 7");
                break;
            case 8:
                System.out.println("Studentot dobil 8");
                break;
            case 9:
                System.out.println("Studentot dobil 9");
                break;
            case 10:
                System.out.println("Studentot dobil 10");
                break;
            default:
                System.out.println("Nepoznata ocenka");
        }
    }
} //da se resi za doma ovaa zadaca
