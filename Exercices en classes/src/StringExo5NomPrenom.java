import java.util.*;
public class StringExo5NomPrenom {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Donnez votre nom :");
	        String nom = scan.nextLine();
	        System.out.println("Donnez votre prénom :");
	        String prenom = scan.nextLine();
	        System.out.println("Quel format : ");
	        System.out.println("1 = court-endroit");
	        System.out.println("2 = court-envers");
	        System.out.println("3 = long-endroit");
	        System.out.println("4 = long-envers");
	        System.out.println("5 = long-endroit-titre");
	        int format = scan.nextInt();
	        System.out.println("Donnez votre sexe (h ou f) :");
	        char sexe = scan.next().charAt(0);

	        formateName(nom, prenom, format, sexe);
	        
	        scan.close();
	    }

	    public static void formateName(String nom, String prenom, int format, char sexe){
	        String courtHomme = "M.";
	        String courtFemme = "Mme";
	        String longHomme = "Monsieur";
	        String longFemme = "Madame";
	        String titreHomme = "le professeur";
	        String titreFemme = "la professeure";
	        String newName = "";

	        switch (format){
	            case 1 :
	                if (sexe == 'h')
	                    newName = courtHomme + " " + prenom + " " + nom;
	                else
	                    newName = courtFemme + " " + prenom + " " + nom;
	                break;
	            case 2 :
	                if (sexe == 'h')
	                    newName = courtHomme + " " + nom + " " + prenom;
	                else
	                    newName = courtFemme + " " + nom + " " + prenom;
	                break;
	            case 3 :
	                if (sexe == 'h')
	                    newName = longHomme + " " + prenom + " " + nom;
	                else
	                    newName = longFemme + " " + prenom + " " + nom;
	                break;
	            case 4 :
	                if (sexe == 'h')
	                    newName = longHomme + " " + nom + " " + prenom;
	                else
	                    newName = longFemme + " " + nom + " " + prenom;
	                break;
	            case 5 :
	                if (sexe == 'h')
	                    newName = longHomme + " " + titreHomme + " " + prenom + " " + nom;
	                else
	                    newName = longFemme + " " + titreFemme + " " + prenom + " " + nom;
	                break;
	        }
	        System.out.println(newName);
	    }
	}