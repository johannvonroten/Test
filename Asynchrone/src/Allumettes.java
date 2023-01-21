import java.util.Scanner;

public class Allumettes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int nombreDepart, reste, enleve, i=0, resultat;
		
		String nomJA, nomJB;
		
		System.out.println ("Nom du joueur A ");		
		nomJA = scan.next();
		System.out.println ("Nom du joueur B ");		
		nomJB = scan.next();

		System.out.println ("Combien d'allumettes du jeu ? ");		
		nombreDepart = scan.nextInt();
		
		System.out.println (nomJA + ", veuillez tirer des allumettes");
		enleve = scan.nextInt();	
		
		reste = nombreDepart - enleve;
		
		System.out.println ("Il reste " + reste + " allumettes");	
		
	while (reste>0){
		
		if (i%2 == 1) {
			System.out.println (nomJA + ", veuillez tirer des allumettes");
			enleve = scan.nextInt();}
		else {
			System.out.println (nomJB + ", veuillez tirer des allumettes");
			enleve = scan.nextInt();}
		
		reste -= enleve;
		
		System.out.println ("Il reste " + reste + " allumettes");		
	
		i++;
		
	}
		resultat = i%2;
		
		if (resultat == 1)
			System.out.println ("Le gagnant est : " + nomJB);		
		else
			System.out.println ("Le gagnant est : " + nomJA);		
	
		 }
		
	}