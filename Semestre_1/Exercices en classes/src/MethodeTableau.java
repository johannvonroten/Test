import java.util.Scanner;

public class MethodeTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int [] table = new int [10];
		int []tableau2;
		double moyenne;
		int nbElem;
		
//		Autre manière possible : On ne créé pas le tableau depuis le main mais on délègue la création à une méthode
		System.out.println("Entrer un nombre d'élémentts : " );
		nbElem = scan.nextInt ();
		
		tableau2 = creeTableau (nbElem, 100, 200);
		afficheTableau (tableau2);
		
//		Remplis aléatoirement ce tableau avec des nombres de borne inférieur à borne supérieure
		fillRandomTableInt (table, 20, 50);
		
//		calcul de la moyenne de ce tableau
		moyenne = moyenneTableau (table);
		System.out.println("La moyenne du tableau est de : " + moyenne);	

//		affichage du vecteur
		afficheTableau (table);	
	}
	
	/**
	 * Affichage du tableau
	 * @param t : Vecteur
	 */
	public static void afficheTableau(int []t) {
		System.out.println();	

		for(int i = 0 ; i<t.length ; i++)
			System.out.print(t[i] + " ");
		
		System.out.println();		
	}
	/**
	 * Méthode qui remplis aléatoirement un vecteur d'int avec des nombres entre deux bornes données
	 * @param t : le vecteur
	 * @param min : Borne inférieur
	 * @param max : Borne supérieur
	 */
	public static void fillRandomTableInt(int []t, int min, int max) {
		int plageDeNombre;
		
		plageDeNombre = max - min;

		for(int i = 0 ; i<t.length ; i++)
				t[i] = (int) (Math.random() * plageDeNombre + min);		
	}
	/**
	 * Faire la moyenne et la retourner
	 * @param t : Vecteur
	 * @return : retour de la moyenne
	 */
	public static double moyenneTableau(int []t) {
		int i, addition = 0;
		double moyenne;
		
		for(i = 0 ; i<t.length ; i++) {
		addition += t[i];}
		
		return (double) addition/t.length;
}
	public static int [] creeTableau (int n, int min, int max) {
		int[]monTableau = new int [n];
		
		fillRandomTableInt (monTableau, 20, 50);
				
		return monTableau;
	}
	
	
	
	
	
}