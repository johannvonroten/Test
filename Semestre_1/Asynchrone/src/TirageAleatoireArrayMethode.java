import java.util.Random;
import java.util.Scanner;

public class TirageAleatoireArrayMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int nombre;
		int [] tabl1;	
		boolean [] verif;
		
		System.out.println ("Combien de tirages voulez-vous ? ");		
		nombre = scan.nextInt();
		
		tabl1 = new int [nombre];
		verif = new boolean [nombre+1];
		
		remplirMaMatrice (tabl1, verif, nombre);
		
		afficheTableau (tabl1);	


	
	}
	public static void remplirMaMatrice(int []t,boolean []v, int n) {
		Random random = new Random ();
		int ti;
		
	for (int i = 0 ; i<v.length ; i++ ) {
	v [i] = true;
	}
	
	int i=0;
	
	while (i<n) {
		ti = random.nextInt(n)+1;
		
		if (v [ti] != false) {
			t [i] = ti;	
			v [ti] = false;
			i++;
		}		
	}	
	}
	
	public static void afficheTableau(int []t) {
	
	for (int j = 0 ; j<t.length ; j++) {						
		System.out.print (t [j]);		
		System.out.print (" ");		
		}
}
}