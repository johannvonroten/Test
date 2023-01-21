import java.util.Scanner;

public class Exo1Examen2013Dictionnaire {
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
        int longueurSubstring = mot.length();
        int nbprop = 0;
        boolean test = false;
        for (int i = 0; i< tableau.length; i++){
            if (longueurSubstring<tableau[i].length()){
                String nouveau = tableau[i].substring(0, longueurSubstring);
                if (mot.equals(nouveau)){
                    test = true;
                    nbprop++;
                }
                else
                    test = false;
            }
            if (test == true && nbprop<=5)
                System.out.println(tableau[i]);
        }
    }
}