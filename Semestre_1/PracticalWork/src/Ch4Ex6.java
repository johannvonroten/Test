import java.util.Scanner;

public class Ch4Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int [] nombre;	
		int [] nombre1;	
		int k;
		
		System.out.println ("Combien de hauteur voulez-vous ? ");		
		k = scan.nextInt();
		
		nombre = new int [k];
		nombre1 = new int [k];
		
		pascal (nombre, k);			
		
	}
	public static void pascal(int[] nombre, int k) {
		
		int [] nombre1;	
		nombre1 = new int [k];

		for (int i = 0 ; i<nombre.length ; i++) {
			nombre [i] = 0;
			
		}
		for (int i = 0 ; i<nombre.length ; i++) {
			nombre1 [i] = 0;
			
		}
		
		
		
		
		
		
		for (int j = 0 ; j<nombre.length ; j++) {						
		System.out.print (nombre[j] + " ");		
		}

}
}