import java.util.Scanner;
public class NombresPremiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX=1000 ;
		boolean []trace = new boolean[MAX] ;
		int i, borne, candidat ;
		
		Scanner saisie = new Scanner(System.in) ;
		
		do
		{
		System.out.println("Quelle est la borne maximale (<= " + (MAX-1)+ ") ? ") ;
		borne = saisie.nextInt() ;
		}
		while (borne <= 0 || borne >= MAX) ;
		for (i=0 ; i<MAX ; i++) // Initialisation du tableau de contrôle
		trace[i] = true ;
		trace[0] = false ; // 0 et 1 ne nous intéressent pas
		trace[1] = false ;
		candidat = 1 ; // candidat indique le nombre traité
		do {
		do
		++candidat ; // prochain candidat
		while (! trace[candidat]) ;
		for (i = 2*candidat ; i<borne ; i += candidat)
		trace[i] = false ; // on trace tous les multiples du candidat
		} while (candidat*candidat < borne) ;
		// arrêt du traitement à la racine de la borne demandée
		for (i=0 ; i<borne ; i++)
		if (trace[i]) // Affichage du tableau
		System.out.printf("%5d", i) ;
		}
		}
