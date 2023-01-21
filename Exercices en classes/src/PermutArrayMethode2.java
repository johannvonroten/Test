
public class PermutArrayMethode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5; 

		int [][]t = alloueMatrice(n);
		remplitMatrice (t, n);
		affiche(t);	
		
		int [][]tdeux = alloueMatrice(n);
		remplitMatriceDeux (tdeux, n, t);
		affiche(tdeux);			
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
	
	public static void remplitMatrice(int[][] tabl, int taille) {
		int k = 1;
		for (int i = 0 ; i<tabl.length ; i++) 	{
			for (int j = 0 ; j<tabl[0].length ; j++) 	{
			tabl [i][j] = k;
			k++;
		}
		}	
	}
	public static void remplitMatriceDeux(int[][] tablDeux, int taille, int[][] tabl ) {
		for (int i = 0 ; i<tablDeux.length ; i++) 	{
			for (int j = 0 ; j<tablDeux[0].length ; j++) 	{
				tablDeux [i][j] = tabl [j][i];
			}
		}		
	}	
}
	
	
	
	
	

