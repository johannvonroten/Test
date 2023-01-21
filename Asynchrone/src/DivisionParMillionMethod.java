import java.util.Scanner;

public class DivisionParMillionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long nombre ;
		Scanner saisie = new Scanner(System.in) ;
		System.out.println("Entrer un nombre entier à 11 chiffres sous la forme 41788011699:") ;
		nombre = saisie.nextLong() ;
		System.out.println("L'indicatif du pays est " + indicatifPays(nombre)) ;
		System.out.println("L'indicatif de la région est " + indicatifRegion(nombre)) ;
		System.out.println("Le numéro de téléphone est " + numeroTelephone(nombre)) ;
		}
		public static int extraitEntier(long nbre, int debut, int fin){
		int longueurAExtraire = fin - debut + 1 ;
		int debutTraitement = 10 - fin ;
		int i, diviseur = 1 ;
		long modulo = 1 ;
		for (i=1 ; i<=debutTraitement ; i++)
		diviseur *= 10 ;
		nbre /= diviseur ;
		for (i=1 ; i<=longueurAExtraire ; i++)
		modulo *= 10 ;
		return (int) (nbre%modulo) ;
		}
		public static int indicatifPays(long nbre){
		return extraitEntier(nbre, 0, 1) ; // attention, ‘coordonnées’ développeur
		}
		public static int indicatifRegion(long nbre){
		return extraitEntier(nbre, 2, 3) ;
		}
		public static int numeroTelephone(long nbre){
		return extraitEntier(nbre, 4, 10) ;
		}
		}
