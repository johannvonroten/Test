
public class johannvonroten1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tempNuit = {-9, -7, 2, 1, 2, -5, -9};
		int [] tempJour = {0, 5, 10, 9, 6, 4, 4};
		int [] ecart = new int [7];		
		
		calculEcarts (tempNuit, tempJour, ecart);	
		affiche (ecart);	
		afficheEcartMax (ecart);
	
	}
    public static void calculEcarts(int[]tabN, int[]tabJ, int []tabE ){
//	Calcul des écarts de température, jour - nuit    	
    	for (int i = 0 ; i<tabE.length ; i++)
    		tabE[i] = tabJ [i]-tabN [i];
    }    	
    public static void affiche(int [] tab){
//   Affichage des écarts 	
        int i;
        for (i=0; i< tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }	   
    public static void afficheEcartMax(int [] tab){
        int i, max;
        String jour = null;
        max = tab[0]; 
//      Malgrés que l'exercice ne demande que le dimanche, 
//      j'ai décidé de proposer plusieurs jours, au cas ou 
//      les données de la matrice seraient changées.    
        for (i=0; i< tab.length; i++){ 
        	if (i == 0)
        	jour = "lundi";
        	if (i == 1)
            	jour = "mardi";
        	if (i == 2)
                jour = "mercredi";
        	if (i == 3)
            	jour = "jeudi";
        	if (i == 4)
            	jour = "vendredi";
        	if (i == 5)
            	jour = "samedi";
        	if (i == 6)
            	jour = "dimanche"; 	
        	if (tab [i]>max)
        		max = tab[i]; 	
        }
        System.out.print("L'écart maximal de la semaine est : " + jour + " " + max + " degrés.");
    }	 	
}