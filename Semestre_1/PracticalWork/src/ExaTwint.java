import java.util.Scanner;

public class ExaTwint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] depenseTotal = new int [3];
		boolean marque[] = new boolean[10];
		
		valideNombre (depenseTotal, marque);
		affiche(depenseTotal);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void affiche(int[] tabl) {
		for (int i = 0 ; i<tabl.length ; i++) {	
			System.out.print(tabl[i]);
			}
		System.out.println();
		}
		
	public static void valideNombre(int[] tabl, boolean [] contr) {
		Scanner scan= new Scanner(System.in) ;
		int taille;
		System.out.println("Veuillez indiquer la taille de l'étoile: (impair) ") ;
		taille = scan.nextInt();
		for (int i = 0 ; i<tabl.length ; i++) {
			if (i==0)
				tabl [i] = taille/100;
			if (i==1)
				tabl [i] = (taille - (tabl [0]*100))/10;
			if (i==2)
				tabl [i] = taille%10;
		}
			for (int j = 0 ; j<contr.length ; j++) {
			contr [j] = false;
			}
			
			for (int i = 0 ; i<tabl.length ; i++) {
				int k = 0;
				
				if (contr [tabl [i]]  = true)
					System.out.println("Les 3 chiffres ne sont pas différents !");
				else 
					contr [tabl [i]]  = true;
					
				
		}
		
	}	
	
	
	
	
	

	
	
	
	
	

}
