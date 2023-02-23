import java.util.Scanner;

public class Ch4Ex4Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int [] nombre;	
		int [] nombre1;	
		int k;
		
		
		
		System.out.println ("Combien de décalages voulez-vous ? ");		
		k = scan.nextInt();
		
		nombre = new int [9];
		nombre1 = new int [9];
		
		nombre [0] = 2;
		nombre [1] = 5;
		nombre [2] = 7;
		nombre [3] = 1;
		nombre [4] = 3;
		nombre [5] = 8;
		nombre [6] = 6;
		nombre [7] = 2;
		nombre [8] = 3;
		
		permut (nombre, k);
		
	}
	public static void permut(int[] nombre, int k) {
		
		int [] nombre1;	
		nombre1 = new int [9];

		for (int i = 0 ; i<nombre.length ; i++) {
			if (i-k<0) {
			nombre1 [i] = nombre [nombre.length-i-k];
			}
			
			else
				nombre1 [i] = nombre [i-k];	
		}
		for (int j = 0 ; j<nombre1.length ; j++) {						
		System.out.print (nombre1[j] + " ");		
		}
	}

}

