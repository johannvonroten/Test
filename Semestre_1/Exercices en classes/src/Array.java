import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//stocker 10 nombres
		int [] nombre;	
		double somme=0;
		Scanner input = new Scanner (System.in);
		int taille, i;
		
		System.out.println ("Nombre total de nombres : ");		
		taille = input.nextInt();
		
		nombre = new int [taille];

//lire les 10 nombres
		
		somme=0;
		for (i = 0 ; i<nombre.length ; i++) {
		
		System.out.println ("Entrez un nombre :");		
		nombre [i] = input.nextInt();
		
		somme += nombre [i];		
		
		}
		System.out.println ("La moyenne est de : " + somme/taille);	
		
//afficher un tableau -> afficher le contenu de chacune des variables
		
//		System.out.println (nombre); // Affiche l'endroit ou est stocké le tableau
		
		for (i = 0 ; i<nombre.length ; i++) {
			System.out.print (nombre [i] + " ");
	}
	}
}
