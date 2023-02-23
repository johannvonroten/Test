import java.util.Scanner;

public class johannvonroten3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int batterie, ecoMode, mode, cptBatterie;
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Entrez le pourcentage restant de batterie ");		
		batterie = scan.nextInt();
		
		System.out.println ("Entrez le seuil désiré à partir duquel le eVTT force le mode 'eco'");		
		ecoMode = scan.nextInt();
	 
		System.out.println ("Entrez le mode désiré : 1 pour 'eco', 2 pour 'trail', 3 pour 'boost' ");		
		mode = scan.nextInt();
		
		if (mode == 1 || mode == 2 || mode == 3)
		System.out.println ("Le mode choisi est possible !");	
		else
		System.out.println ("Il y a une erreur dans le mode choisi.");	
			
		cptBatterie = batterie - 1;
		
		while (cptBatterie>=ecoMode) {
			cptBatterie--;

			if (cptBatterie==ecoMode&& mode != 1)
				System.out.println ("Le mode eco est forcé car il ne vous reste plus que " + ecoMode + "% de batterie.");
			else if (cptBatterie==ecoMode&& mode == 1)
				System.out.println ("Vous avez ateint vote seuil 'eco'");
	
			
	}
	}
}
