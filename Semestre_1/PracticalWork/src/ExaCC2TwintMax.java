import java.util.Scanner;

public class Twint {
    public static void main(String[] args) {
        char choix = 0;

        //saisie d'un code à 3 chiffres
        saisirCodeMB();
        // sélection des menus
        choix = myMenuMB();
        choixAction(choix);


    }

    public static void saisirCodeMB() {
        int i, a = 0,number, cpt = 0, state = 0, n = 3;
        int[] tab = new int[n];
        boolean[] checktab = new boolean[10];
        Scanner scan = new Scanner(System.in);

        //initialisation du tableau de verif à true
        for (i = 0; i < checktab.length; i++) {
            checktab[i] = true;
        }

        // boucle de remplissage de vecteur " code twint "

            System.out.println("Entrer un code à 3 chiffres tous différents !");
            a = scan.nextInt();
            number = a;
            for (i = 0; i < tab.length; i++) {
                tab[i] = number % 10;
                number = number / 10;
            }
            //vérification

            while (cpt< tab.length)  {
                if (checktab[tab[cpt]] == true && tab[1] != 5) {
                    checktab[tab[cpt]] = false;
                    cpt++;

                } else
                    System.out.println(" chiffre pas correct");;
                    cpt = tab.length + 1;
                }
            if (cpt == 3 ){
                System.out.println(a);

            }
        }


    public static char myMenuMB() {
        char choix = 0;
        int state = 1;
        Scanner scan = new Scanner(System.in);
            System.out.println("Choisissez un menu");
            System.out.println("‘b’ ou ‘B’ pour « Beacon »");
            System.out.println("‘s’ ou ‘S’ pour « Scanneur QR »");
            System.out.println("‘c’ ou ‘C’ pour « Code »");
            System.out.println("‘q’ ou ‘Q’ pour quitter");
            choix = scan.next().charAt(0);


            return choix;
        }
    public static void choixAction(char a) {

        switch (a) {

            case 'b', 'B':
                System.out.println("Vous avez choisi l’action Beacon");
                break;
            case 's', 'S':
                System.out.println("Vous avez choisi l’action Scanner");
                break;
            case 'c', 'C':
                System.out.println("Vous avez choisi l’action Code");
            case 'q', 'Q':
                System.out.println("Programme terminé");
                break;
            default:
                System.out.println("Erreur de saisie");


        }
    }
}

