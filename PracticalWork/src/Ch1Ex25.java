import java.util.Scanner;

public class Ch1Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Développez une application Java qui détermine si le client 
		//d'un magasin d'alimentation a dépassé sa limite de crédit 
		//sur son compte débiteur. Pour chaque consommateur, vous disposez 
		//des données suivantes : 
		//  Le numéro de comptes ; 
		//  Le solde au début du mois ; 
		//  Le total des articles portés en compte de ce client ce mois-ci ; 
		//  Le total de tous les crédits appliqués au compte de ce client ce mois-ci ; 
		//  La limite de crédit autorisée 
		//Le programme doit saisir chaque donnée sous la forme d'entiers, 
		//calculer le nouveau solde (= solde du début + coûts – crédits), 
		//afficher le nouveau solde et déterminer si le nouveau solde dépasse 
		//la limite de crédit du client. Pour les clients qui dépassent leur 
		//limite de crédit, le programme doit afficher le message "Limite de "+ "crédit dépassée". 
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quel est votre numéro de compte ? ");
		int numCompte = scan.nextInt();
		
		System.out.println("Quel est votre solde au début de ce mois ? :");
		int soldeDebut = scan.nextInt();
		
		System.out.println("Quelle est le total d'articles porté en compte ?");
		int totalArticle = scan.nextInt();
		
		System.out.println("Quel est votre total de crédit ?");
		int totalCredit = scan.nextInt();

		System.out.println("Quel est votre limite de crédit ?");	
		int limiteCredit = scan.nextInt();

		
		System.out.println("Votre nouveau Solde est de " + (soldeDebut+totalArticle-totalCredit));	
		
		if ((soldeDebut+totalArticle-totalCredit)> limiteCredit)
		System.out.println("Limite de crédit dépassée");	
		
	
			
		
		
	}

}
