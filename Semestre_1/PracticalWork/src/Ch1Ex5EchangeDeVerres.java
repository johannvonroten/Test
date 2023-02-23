
public class Ch1Ex5EchangeDeVerres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbA = 1, nbB = 3, nbC = 5, temp ; 
		
		temp = nbA ;
		nbA = nbC ;
		nbC = nbB ;
		nbB = temp;
		
		System.out.println ("La valeur de A" +nbA);
		System.out.println ("La valeur de B" +nbB);
		System.out.println ("La valeur de C" +nbC);
	}

}
