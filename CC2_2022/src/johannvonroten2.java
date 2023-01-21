
public class johannvonroten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] calendrier =new int [4][6];				
		remplitCalendrier (calendrier);
		affiche (calendrier);	
	}
	public static void remplitCalendrier(int [][] n) {
		int borne = 24;
		int indiceCourant = 0; 
		boolean marque[] = new boolean[borne+1]; 
// 		Initialisation du tableau boolean en false
		for (int i = 0; i < marque.length; i++) {
			marque[i]=false;
		}
//		Contrôle des doublons
		while (indiceCourant < 24) {
			for (int i = 0; i < n.length; i++) {
				for (int j = 0; j < n[0].length; j++) {
					int tirage = (int)(Math.random()*borne)+1;            
					if (marque[tirage] == false) {
						n[i][j] = tirage;
						marque[n[i][j]] = true;
						indiceCourant++;
					}
					
					else if (marque[tirage] == true) 
						j--;
			}
            }
		}
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
	}	
}