
public class CandyCrushArrayMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] jeu = new int [9][9];
		boolean[] controleBool = new boolean [7];
		
		int tirage=0;
		
		tirageCandy(jeu, 1, 6);
		
		affiche (jeu);
		
		booleanFalse (controleBool);
		
		controleLigne (controleBool, jeu);
		
		controleColonne(controleBool, jeu);
	}
	public static void tirageCandy(int [][] tab, int n, int borne) {
		
		for (int i = 0; i<tab.length; i++)
			for (int j = 0; j<tab[0].length; j++)
				tab [i][j] = (int)(Math.random()*borne)+n;
	}	
	public static void affiche(int[][] tabl) {
		for (int i = 0 ; i<tabl.length ; i++) {	
			for (int j = 0 ; j<tabl[0].length ; j++) {
			System.out.print(tabl[i][j] + "\t");
			}
		System.out.println();
		}
	}	
	public static void booleanFalse(boolean[] tabC) {
		int num, compte = 0;
		for (int i = 0 ; i<tabC.length ; i++) {	
			tabC[i] = false;		
		}
	}
	public static void controleLigne(boolean[] tabC, int [][] tabJ) {
		int num, compte = 0;
		for (int i = 0 ; i<tabJ.length ; i++) {	
			for (int j = 0 ; j<tabJ[0].length ; j++) {
				num = tabJ [i][j];
				if (tabC [num] != true) {
					booleanFalse (tabC);
					tabC [num] = true;
					compte = 0;}				
				else {
					compte++;
					if (compte==3)
						System.out.println("Nous avons une suite de 3 nombre identiques à la ligne : " + i);
					}
				}				
			}
			booleanFalse (tabC);
		}
	public static void controleColonne(boolean[] tabC, int [][] tabJ) {
		int num, compte = 0;
		for (int i = 0 ; i<tabJ[0].length ; i++) {	
			for (int j = 0 ; j<tabJ.length ; j++) {
				num = tabJ [j][i];
				if (tabC [num] != true) {
					booleanFalse (tabC);
					tabC [num] = true;
					compte = 0;}
	
				else {
					compte++;
					if (compte==3)
						System.out.println("Nous avons une suite de 3 nombre identiques à la colonne : " + i);
					}
				}
				
			}
			booleanFalse (tabC);
		}	
}
