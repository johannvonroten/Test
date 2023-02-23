
public class EuromillionProfMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = tirage(5, 50); 	// 5 numéros parmi 50 valeurs
		int[] etoile = tirage(2, 12);	// 2 étoiles parmi 12 valeurs
		
		System.out.print("Numéros:  ");
		affiche(numero);
		System.out.print("Etoiles:  ");
		affiche(etoile);
		
	}
	
	
	// la méthode tire n valeurs distinctes parmi des valeurs de 1 à borne y.c
	public static int[] tirage(int n, int borne) {
		int tab[] = new int[n]; 				// allocation du vecteur
		boolean marque[] = new boolean[borne+1]; 
		
		int indiceCourant = 0; 
		
		while (indiceCourant < n) {
			int tirage = (int)(Math.random()*borne)+1;
			
			if (marque[tirage] == false) {  	// pas déja tiré
				tab[indiceCourant] = tirage;	// tirage valide
				marque[tirage] = true;			// marquage
				indiceCourant++;				// on avance ds tab
			}
		}
		
		return tab;		
				
	}
	
	public static void affiche(int[] v)
	{
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		
		System.out.println();
		
	}

}