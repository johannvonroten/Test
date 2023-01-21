import java.util.*;
public class StringExo6JourDate {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);

	       System.out.println("Jour : ");
	       int jour = scan.nextInt();
	       System.out.println("Mois : ");
	       int mois = scan.nextInt();
	       System.out.println("Année : ");
	       int annee = scan.nextInt();

	       zellerAlgo(jour, mois, annee);

	       scan.close();
	    }

	    public static void zellerAlgo (int jour, int mois, int annee){
	        int m, a, s, numJour;
	        String [] Jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

	        if (mois > 2){
	            m = mois - 2;
	            a = annee;
	        }
	        else {
	            m = mois + 10;
	            a = annee - 1;
	        }
	        s = a/100;
	        a = a - 100 * s;
	        numJour = ((13*m -1)/5)+jour+a+s/4+a/4-2*s+77;
	        numJour = numJour -7 * (numJour / 7);
	        System.out.println(Jours[numJour-1]);
	    }
	}