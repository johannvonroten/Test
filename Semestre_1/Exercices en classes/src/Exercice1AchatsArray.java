import java.util.Scanner;

public class Exercice1AchatsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nombre;	
		double somme=0, moyenne;
		Scanner input = new Scanner (System.in);
		int taille, i, j=0, total;
		
		System.out.println ("Combien de commandes avez vous fait : ");		
		taille = input.nextInt();
		
		nombre = new int [taille];
		
		somme=0;
		for (i = 0 ; i<nombre.length ; i++) {
		
		System.out.println ("Combien à coûté votre achat "  + (i+1) + " ?");		
		nombre [i] = input.nextInt();
		
		somme += nombre [i];		
		
		}
		total = nombre [0];
		for (i = 0 ; i<nombre.length ; i++) {						
			if (nombre [i]>total)
				total = nombre [i];
			
		}
		moyenne = (somme/taille);
		for (i = 0 ; i<nombre.length ; i++) {						
			if (nombre [i]>moyenne)
			j++;
		}
		System.out.println ("Le total est de  " + somme + ".-");
		System.out.println ("La moyenne de vos achats est de  " + moyenne + ".-");
		System.out.println ("Le dépense la plus haute s'élève à " + total + ".-");
		System.out.println (j + " de vos articles sont plus cher que la moyenne total de vos achat !");
	}	
}