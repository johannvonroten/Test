import java.util.Random;

public class MatriceArrayDimensionMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Créer une matrice
		int [ ][ ]matrice = new int[4][6] ;
		int addition;

//		Remplir aléatoirement la matrice de nombres entre 1 et 10		
		remplirMaMatrice (matrice, 1, 10);
		
//		afficher la matrice		
		afficheTableau (matrice);	

//		Calculer la somme d'une ligne
		sommeLigne (matrice);

//		Calculer la somme d'une colonne
		sommeColonne (matrice);
		
	}
	public static void remplirMaMatrice(int [][]m,int min, int max) {
	int i, j;
	
	for (i = 0 ; i<m.length ; i++) {	
		for (j = 0 ; j<m[0].length ; j++) {
			m[i][j] = (int) (Math.random()*10+1) ;			
		}
	}
}
	public static void afficheTableau(int [][]m) {
		int i, j;
	
		for(i = 0 ; i<m.length ; i++) {
			for (j = 0 ; j<m[0].length ; j++) {
			System.out.print(m[i][j] + "\t");
			}
			System.out.println();		
	}
}	
	public static void sommeLigne(int [][]m) {
		int i, j, additionLigne=0;
		
		for (i = 0 ; i<m.length ; i++) {
			additionLigne = 0;
			for (j = 0 ; j<m[0].length ; j++) {				
				additionLigne += m[i][j] ;				
			}
			System.out.print ("Addition de la ligne : " + (i+1) + " = " + additionLigne);
			System.out.println ();
		}
	}
	public static void sommeColonne(int [][]m) {
		int i, j, additionColonne=0;
		
		for (i = 0 ; i<m[0].length ; i++) {
			additionColonne = 0;
			for (j = 0 ; j<m.length ; j++) {				
				additionColonne += m[j][i] ;				
			}
			System.out.print ("Addition de la colonne : " + (i+1) + " = " + additionColonne);
			System.out.println ();
		}
	}	
}