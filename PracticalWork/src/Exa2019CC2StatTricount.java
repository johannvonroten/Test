
public class Exa2019CC2StatTricount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] depenseTotal = new int [13][3];
		int numUn=0, numDeux=1, diffUn, diffDeux;
		
		depenseTotal = dataTricount(depenseTotal);
		affiche(depenseTotal);
		numUn = afficheDepense (depenseTotal, 0);
		System.out.println("La personne 0 a dépensé : " + numUn);
		
		numDeux = afficheDepense (depenseTotal, 1);
		System.out.println("La personne 1 a dépensé : " + numDeux);

		diffUn = quiDoitCombienAQui (depenseTotal, 0);

		diffDeux = quiDoitCombienAQui (depenseTotal, 1);

		leCalcul (diffUn, diffDeux);	
	}
	public static int [][]dataTricount(int [][] d){
		int [][] data = {{290, 0, 2},
						{45, 1, 2},
						{108, 0, 2},
						{129, 0, 2},
						{89, 1, 2},
						{95, 1, 2},
						{124, 0, 2},
						{325, 1, 1},
						{45, 0, 0},
						{23, 1, 2},
						{92, 0, 2},
						{111, 1, 1},
					 	{118, 1, 2}} ;		
		return data ;
	}
	public static void affiche(int[][] tabl) {
		for (int i = 0 ; i<tabl.length ; i++) {	
			for (int j = 0 ; j<tabl[0].length ; j++) {
			System.out.print(tabl[i][j] + ", ");
			}
		System.out.println();
		}
	}	
	public static int afficheDepense(int[][] tabl, int t) {
		int tot=0, i=0;
		
			for (int j = 0 ; j<tabl[0].length ; j++ ) {
				for (i = 0 ; i<tabl.length ; i++) {			
					if (tabl[i][1] == t) {
					tot += tabl [i][0];					
				}		
			}
			t=tot;
		}	
		return t;
	}	
	public static int quiDoitCombienAQui(int[][] tabl, int t) {
		int tot=0;
		
			for (int j = 0 ; j<tabl[0].length ; j++ ) {
				for (int i = 0 ; i<tabl.length ; i++) {			
					if (tabl[i][2] == 2 &&tabl[i][1] == t) {
					tot += tabl [i][0];										
				}						
			}
			t=tot;
		}
		return t;	
	}
	public static void leCalcul(int u, int d) {
		int tot=0, med1, med2;
		
		tot = (u+d)/2;
		med1 = (u-tot);
		med2 = (d-tot);
		
		if (med1>0)
			System.out.println("La personne 1 doit " + med1 + ".- à la personne 0.");
		else 
			System.out.println("La personne 0 doit " + med2 + ".- à la personne 1.");
	}	
}
