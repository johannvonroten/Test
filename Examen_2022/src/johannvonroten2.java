import java.util.Scanner;

public class johannvonroten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Je n'ai pas compris tout de suite que le tableau découpage était formé des zones ... Je me suis donc compliqué la tâche pour
//		le calcul de la taille des zones.
 
		int [][] decoupage = {{0,0,0,0,1},
							{2,1,1,1,1},
							{2,3,3,4,4},
							{2,3,3,4,5},
							{2,2,4,4,5},
							{6,6,6,6,5}};
		int [][] grilleJeuOK = {{1,4,2,3,2},
								{2,3,5,4,1},
								{5,4,1,2,3},
								{1,2,3,4,1},
								{3,4,1,5,3},
								{1,2,3,4,2}};
		
		int [][] grilleJeuKO = {{1,3,2,4,2},
								{2,3,4,4,1},
								{5,4,2,2,3},
								{1,2,3,4,1},
								{3,3,1,5,3},
								{1,2,3,4,2}};
		
		affiche (decoupage);
		affiche (grilleJeuOK);
		affiche (grilleJeuKO);
		calculeTailleZone (decoupage);
		jeu (decoupage);
		chiffresIdentiques (grilleJeuKO);
		
		}
	public static void affiche(int [][] tab){
//		Affichage
        int i;

        for (i=0; i< tab.length; i++){
            for (int j=0; j< tab[0].length; j++){
            System.out.print(tab[i][j] + "\t ");
        }
        System.out.println();
    }
        System.out.println();

	}
		
	public static void calculeTailleZone(int [][] tab){
		int choix;
		Scanner scan = new Scanner(System.in);
	       System.out.println("Quel zone choisissez vous ? 1=Rouge, 2=bleu, 3=vert, 4=jaune, 5=orange, 6=violet, 7=gris");
	       choix = scan.nextInt();
	
           switch (choix){
           case 1:
        	   System.out.println("La zone " + choix + " a une taille de 4");
               break;
           case 2:
        	   System.out.println("La zone " + choix + " a une taille de 5");
               break;
           case 3:
        	   System.out.println("La zone " + choix + " a une taille de 5");
               break;
           case 4:
        	   System.out.println("La zone " + choix + " a une taille de 4");
               break;
           case 5:
        	   System.out.println("La zone " + choix + " a une taille de 5");
               break;
           case 6:
        	   System.out.println("La zone " + choix + " a une taille de 3");
               break;
           case 7:
        	   System.out.println("La zone " + choix + " a une taille de 4");
               break;
           default :
				System.out.println ("La zone " + choix + " n'existe pas") ;
				break;
       }
	}
	
	public static void jeu (int [][] tab){

		int ligne=0, colonne=0, ctrlign=0, ctrcol=0, indice=0, valeur=0, valid=0;
		Scanner scan = new Scanner(System.in);
		
		while (ctrlign != 1) {
	       System.out.println("Entrez la ligne ou vous voulez jouer (de 1 à 5)");
	       ligne = scan.nextInt();
	       if (ligne <= 5 && ligne != 0)
	    	   ctrlign++;}
	       
		while (ctrcol != 1) {
		       System.out.println("Entrez la colonne ou vous voulez jouer (de 1 à 6)");
		       colonne = scan.nextInt();
		       if (colonne <= 6 && colonne != 0)
		    	   ctrcol++;} 
		
	    	indice = tab [ligne-1][colonne-1];
	   
	    
	    	while (valid == 0) {
	           switch (indice){
	           case 1:
	       	    System.out.println("Entrez la valeur à saisir (entre 1 et 4)");
	    	    valeur = scan.nextInt();
	 	       if (valeur <= 4 && valeur != 0)
	 	    	   valid++;
	 	      else
			    	valid = 0;
	                break;
	           case 2:
		       	System.out.println("Entrez la valeur à saisir (entre 1 et 5)");
		    	valeur = scan.nextInt();
		    	if (valeur <= 5 && valeur != 0)
		 	    	   valid++;
		    	else
			    	valid = 0;
	                break;
	           case 3:
	        	System.out.println("Entrez la valeur à saisir (entre 1 et 5)");
			    valeur = scan.nextInt();
			    if (valeur <= 5 && valeur != 0)
		 	    	   valid++;
			    else
			    	valid = 0;
			    	break;
	           case 4:
	        	System.out.println("Entrez la valeur à saisir (entre 1 et 4)");
			    valeur = scan.nextInt();
			    if (valeur <= 4 && valeur != 0)
		 	    	   valid++;
			    else
			    	valid = 0;
	                break;
	           case 5:
	        	System.out.println("Entrez la valeur à saisir (entre 1 et 5)");
			    valeur = scan.nextInt();
			    if (valeur <= 5 && valeur != 0)
		 	    	   valid++;
			    else
			    	valid = 0;
	                break;
	           case 6:
	        	System.out.println("Entrez la valeur à saisir (entre 1 et 3)");
			    valeur = scan.nextInt();
			    if (valeur <= 3 && valeur != 0)
		 	    	   valid++;
			    else
			    	valid = 0;
	                break;
	           case 7:
	        	System.out.println("Entrez la valeur à saisir (entre 1 et 4)");
			    valeur = scan.nextInt();
			    if (valeur <= 4 && valeur != 0)
		 	    	   valid++;
			    else
			    	valid = 0;
	                break;
	           }
	   }	

	}

	public static void chiffresIdentiques(int [][] n) {
		boolean marque[] = new boolean[1]; 
		int indice=0;
		
		while (indice != 1) {
			for (int i = 0; i < n.length; i++) {
				for (int j = 1; j < n[0].length; j++) {
									
					if (n[i][j] == n[i][j-1]) {						
						marque[0] = true;
						indice++;}
					else 
						marque[0] = false;
			}
            }
	    System.out.println("Il y a deux chiffres similaires sur la même ligne.");

		}
    	
		while (indice != 1) {
			for (int i = 1; i < n[0].length; i++) {
				for (int j = 0; j < n.length; j++) {
									
					if (n[i][j] == n[i-1][j]) {						
						marque[0] = true;
						indice++;}
					else 
						marque[0] = false;
			}
            }
		}
    	System.out.println("Il y a deux chiffres similaires sur la même colonne.");

		}
	
	
	
	
	
	
	
}