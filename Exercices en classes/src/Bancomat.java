
public class Bancomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int montant=590, nb200, solde, nb100, nb50, nb20  ;
		nb200 = montant/200 ;
		solde = montant%200 ;
		
		nb100 = solde/100 ;
		solde = solde%100 ;
		
		nb50 = solde/50 ;
		solde = solde%50 ;
		
		nb20 = solde/20;
		solde = solde%20;
		
		System.out.println("Pour un montant de " +montant);
		System.out.println("nous vous donnons ces billet(s) de 200 :" +nb200);
		System.out.println("Billet(s) de 100 :" +nb100);
		System.out.println("Billet(s) de 50 :" +nb50);
		System.out.println("Billet(s) de 20 :" +nb20);
		
	}

}
