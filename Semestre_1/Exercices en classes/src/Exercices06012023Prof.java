
public class Exercices06012023Prof {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub		
		int [] tableau = {2,6,89,34};
		String [] semaine = {"Lundi", "Mardi", "Mercredi", "Jeudi"};
		boolean [] controle = new boolean [4];

		affiche (semaine);
		rechercheTableau (tableau, 6);
		rechercheTableau (semaine, "Lundi");
		
	}
	public static void affiche(String [] tab){
//		Affichage
        int i;

        for (i=0; i< tab.length; i++){

            System.out.print(tab[i] + "\t ");
        }
        System.out.println();
    }	

	    public static boolean rechercheTableau (int []table, int valeur) {
	        System.out.println();

	        for(int i = 0; i< table.length ; i++) {

	            if(table[i] == valeur)
	                return true;
	        }
	        return false;
	    }
	    
	    public static boolean rechercheTableau (String []table, String valeur) {
	        System.out.println();

	        for(int i = 0; i< table.length ; i++) {

	            if(table[i].equals(valeur))
	                return true;
	        }
	        return false;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
}








