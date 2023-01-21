import java.util.Scanner;

public class Exa2014CC2CycleDeSteinhaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 0, mille = 0, cent = 0, dix = 0, unit = 0;
		int [] tableauNmbr = new int [4];
		int [] tableauCarre = new int [4];
		int [] tableauCarre2 = new int [4];

		
		nombre = scanNombre (nombre);
		System.out.print(nombre + (", "));
		
		
		decoupageNmbre (tableauNmbr, nombre);
		affiche(tableauNmbr);
		carreAddition (tableauNmbr, tableauCarre) ;		
		affiche(tableauCarre);

		

//		for (int i = 0 ; i<tableauCarre.length ; i++) {
//		do {					
//		}
//		while (tableauCarre[i]==1 || tableauCarre[i]==145 );
//	}
		
	
		
	}
	public static int scanNombre(int n) {
		Scanner scan = new Scanner (System.in);
		n = 0;
		
		do {
			System.out.println ("Veuillez inscrire un nombre à 4 chiffre : (min 1'000 maximum 10'000)");
			n = scan.nextInt();
		}
		while (n<1000 || n>10000);
		return n;		
	}
	
	public static void decoupageNmbre(int[] tabl, int n) {
		for (int i = 0 ; i<tabl.length ; i++) {
			if (i==0) 
				if (n>999)
				tabl [0] = n/1000;
				else 
					tabl [0] = 0;			
			if (i==1) 
				if (n>99)
				tabl [1] = n/100%10;
				else 
					tabl [0] = 0;						
			if (i==2) 
				if (n>9)
				tabl [2] = n%100/10;
				else 
					tabl [0] = 0;					
			if (i==3)
				if (n>1)
				tabl [3] = n%10;
				else 
					tabl [0] = 0;
			
		}
	}
	
	public static void carreAddition(int[] tabl, int[] tablC) {
		for (int i = 0 ; i<tabl.length ; i++) {			
			tablC [i] = tabl [i]*tabl [i];	
		}
	}	
	
	public static void affiche(int[] tabl) {
	for (int i = 0 ; i<tabl.length ; i++) {			
		System.out.print(tabl[i] + ", ");
	}
	System.out.println();
}
	
	
	
	
	
	
//	public static int decoupageMille (int n) {
//		int milliers;		
//		milliers = n/1000;
//		return milliers;	
//	}	
//	public static int decoupageCent (int n) {
//		int centaines;		
//		centaines = n/100%10;
//		return centaines;	
//	}
//	public static int decoupageDix (int n) {
//		int centaines;		
//		centaines = n%100/10;
//		return centaines;	
//	}
//	public static int decoupageUnit (int n) {
//		int centaines;		
//		centaines = n%10;
//		return centaines;	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
}
