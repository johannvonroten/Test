import java.util.Scanner;

public class EtoileArrayMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=0, v=0;
		int n = saisieTaille(T);
		
		int [][]t = alloueMatrice(n);
		affiche(t);
		
		int valeur = saisieValeur(v);
		
		remplitMatrice (t, valeur, T);
		affiche(t);
		
	}
	
	public static int saisieTaille(int taille) {
		Scanner scan= new Scanner(System.in) ;
		do {
		System.out.println("Veuillez indiquer la taille de l'étoile: (impair) ") ;
		taille = scan.nextInt();
		}
		while (taille%2==0);			
		return taille;			
	}
	
	public static int saisieValeur(int val) {
		Scanner scan= new Scanner(System.in) ;
		System.out.println("De quoi va être composé votre étoile ? de 0 à 9 ") ;
		val = scan.nextInt();
		return val;
	}

	public static int [][] alloueMatrice(int n) {
		int [][]tab;
		tab=new int [n][n];
		return tab;
	}
	
	public static void affiche(int[][] tabl) {
		for (int i = 0 ; i<tabl.length ; i++) {			
			for (int j = 0 ; j<tabl[0].length ; j++) {
				System.out.print(tabl[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void remplitMatrice(int[][] tabl, int v, int taille) {
		int milieu = tabl.length/2;
		for (int i = 0 ; i<tabl.length ; i++) 	{
			tabl [milieu][i] = v;
		}
			for (int j = 0 ; j<tabl[0].length ; j++) {
				tabl [j][milieu] = v;
			}
			for (int i = 0 ; i<tabl.length ; i++) 	{
				tabl [i][i] = v;
		}
			for (int i = 0 ; i<tabl.length ; i++) 	{
				tabl [i][i] = v;
		}
			for (int i = 0, j=tabl.length-1 ; i<tabl.length ; i++, j--) 	{
				tabl [i][j] = v;
		}
	}		
}
	
