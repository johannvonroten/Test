
public class EuromillionProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candidat, numTirage, indiceVerification ;
		int [] tirage ;
		boolean trouve ;
		
		// construction du tableau 
		tirage = new int [7] ;
		
		// tirage des 5 premiers nombres (entre 1 et 50)
		numTirage = 0 ;
		
		while (numTirage < 5){
			candidat = (int) (Math.random()*50 + 1) ;
			
			// je v�rifie que ce nombre n'apparaisse pas d�j� dans le tableau
			indiceVerification = numTirage - 1 ;
			trouve = false ;
			
			while (indiceVerification >= 0 && trouve == false){
				if (tirage[indiceVerification] == candidat)
					trouve = true ;
				else
					--indiceVerification ;
			}
						
			// si je n'ai pas trouv�, j'ins�re le nombre dans le tableau
			// et passe au suivant
			if (trouve == false){
				tirage[numTirage] = candidat ;
				++numTirage ;
			}
		}
		
		// tirage des 2 �toiles
		// on continue � l'indice 5 pour des nombres entre 1 et 12
		while (numTirage < 7){
			candidat = (int) (Math.random()*12 + 1) ;
			
			indiceVerification = numTirage - 1 ;
			trouve = false ;
			
			// v�rification sur le nombre � l'indice 5 et 6
			while (indiceVerification >= 5 && trouve == false)
				if (tirage[indiceVerification] == candidat)
					trouve = true ;
				else
					--indiceVerification ;
			
			if (trouve == false){
				tirage[numTirage] = candidat ;
				++numTirage ;
			}
		}
		
		// Affichage
		System.out.print("5 premiers nombres � cocher : ") ;
		for (int i=0 ; i<5 ; i++)
			System.out.print(" " + tirage[i]) ;

		System.out.println();
		System.out.print("Voici les nombres � cocher pour les �toiles: ") ;
		for (int i=5 ; i<7 ; i++)
			System.out.print(" " + tirage[i]) ;
	}
	
}