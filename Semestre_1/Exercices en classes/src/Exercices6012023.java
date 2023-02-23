
public class Exercices6012023 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub		
		int [] tableau =new int [10];				
		remplitTableau (tableau);
		affiche (tableau);	
	}
	public static void remplitTableau(int [] n) {
		int borne = 100;
		int indiceCourant = 0; 
		boolean marque[] = new boolean[borne+1]; 
// 		Initialisation du tableau boolean en false
		for (int i = 0; i < marque.length; i++) {
			marque[i]=false;
		}
//		Contrôle des doublons
		while (indiceCourant < 10) {
			for (int i = 0; i < n.length; i++) {
					int tirage = (int)(Math.random()*borne)+1;            
					if (marque[tirage] == false) {
						n[i] = tirage;
						marque[n[i]] = true;
						indiceCourant++;
					}					
					else if (marque[tirage] == true) 
						i--;
			}
            }
		}		
	public static void affiche(int [] tab){
//		Affichage
        int i;

        for (i=0; i< tab.length; i++){

            System.out.print(tab[i] + "\t ");
        }
        System.out.println();
    }	
}