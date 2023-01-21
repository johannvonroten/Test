import java.util.Scanner;

public class autreManièreDictionnaire {

	public static void main(String[] args) {

        String[] dictionnaire = {"eduqué", "effronté",
                "enivré", "enfoiré", "enneigé", "entêté", "embêté",
                "emmené", "empêtré", "foireux", "joie", "joli",
                "joue", "jour", "journal", "journalier", "journée"} ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un mot :");
        String mot = scan.next();

        mots(mot, dictionnaire);
        
        scan.close();

    }

    public static void mots (String mot, String[]tableau){
        boolean test = false;
        int nbprop = 0;
        char [] check = new char[mot.length()];
        for (int i = 0; i< check.length; i++){
            check[i] = mot.charAt(i);
        }
        System.out.println("Voici les mots proposés (5 propositions max) : ");


        for (int i = 0; i < tableau.length; i++){
            for (int j = 0; j < check.length; j++){
                if (tableau[i].charAt(j) == check[j])
                    test = true;
                else
                    test = false;
            }
            if (test){
                nbprop++;
                System.out.println(tableau[i]);
            }
            if (nbprop == 5)
                break;
        }




    }

}