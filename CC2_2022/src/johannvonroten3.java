import java.util.Scanner;

public class johannvonroten3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int client=0;

		int [][]tableau = {{1245, 234, 1},
						{3201, 125, 2},
						{1100, 202, 4}, 
						{1245, 401, 4},
						{1854, 135, 6},
						{1245, 256, 10},
						{1763, 197, 10},
						{3201, 236, 12},
						{1555, 371, 16},
						{1245, 302, 16},
						{1432, 203, 16},
						{1100, 314, 23},
						{3201, 134, 24},
						{1852, 252, 25},
						{7321, 361, 29}} ;
//		Je ne suis pas sûr d'avoir bien compris le point 2, je l'ai traduit par ce scan:
		System.out.println ("Entrez un numéro de client :");
		client = scan.nextInt();
		
		totalAchatClient (tableau, client);
	}
	public static void totalAchatClient(int [][] tab, int c){
        int i, contr, tot = 0;
        contr = 0;      
            for ( i=0; i<tab.length; i++){               
            	if (c == tab[i][0]) 
            	contr += tab [i][1];                    	
        } 
            if (contr != 0)
            	System.out.println ("Total des achats de " + c + " : " + contr );            
            if (contr == 0)
        		System.out.println (c + " n'a effectué aucun achat ce mois.");        
    }	
}
