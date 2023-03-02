import java.util.Scanner;
public class VoitureDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=0;

        Roue roue1 = new Roue(15, 2);
        Moteur moteur1 = new Moteur(4, 200);
        Voiture voiture1 = new Voiture(1600, 207, 21, 2.0, 10000);
        Kit kit1 = new Kit(2000, 250);

        System.out.println("La voiture1 a " + voiture1.moteur.cylindre + " cm3 et " + voiture1.moteur.chevaux + " chevaux" + " et les roues font " + voiture1.roue.size + " pouces et une pression de " + voiture1.roue.pressure + " bar" + " et vaut " + voiture1.argus + " CHF");

        System.out.println("Voulez-vous rajouter un kit ? (0 = oui / 1 = non)");
        int choice = scan.nextInt();

        if (choice == 0)
            System.out.println("La voiture1 gagne " + kit1.puissance + " chevaux et " + kit1.cylindree + " cm3");
        else
            System.out.println("La voiture1 reste comme elle est");

        while (choice != 1 && i < 2) {

            System.out.println("Voulez-vous rajouter un kit ? (0 = oui / 1 = non)");
            choice = scan.nextInt();

            i++;
            switch (choice) {
                case 0:
                    System.out.println("La voiture1 gagne " + kit1.puissance + " chevaux et " + kit1.cylindree + " cm3");
                    break;
                case 1:
                    System.out.println("La voiture1 reste comme elle est");
                    break;
            }

        }

        System.out.println("Voulez-vous aller la laver ? (0 = oui / 1 = non)");
        int choiceLave = scan.nextInt();

        if (choice == 0)
            System.out.println("La voiture1 gagne en valeur, + 0.5% !");
        else
            System.out.println("La voiture1 reste comme elle est");

        i=0;
        while (choiceLave != 1) {

            System.out.println("Voulez-vous aller la laver ? (0 = oui / 1 = non)");
            choiceLave = scan.nextInt();

            i++;
            switch (choiceLave) {
                case 0:
                    System.out.println("La voiture1 gagne en valeur, + 0.5% !");
                    break;
                case 1:
                    System.out.println("La voiture1 reste comme elle est");
                    break;
            }

        }

    }
}
