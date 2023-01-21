
public class SerieHarmoniqueForImb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double terme=3.0, somme=0.0, sommeI=0.0, diviseur = 1;
		
		for (int i = 1 ; i < terme ; i++) {
	
				sommeI= (diviseur/(double) (i));
				somme += sommeI;
				

			}			
		System.out.println(somme);

	}

}
