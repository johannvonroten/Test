
public class Ch4Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []valeur = new int[6];

		 valeur[0] = 1;

		for (int i=1; i<valeur.length ; i++)
		 valeur[i] = valeur[i-1]+2;

		for (int i=0; i<valeur.length ; i++)
		 System.out.print("valeur["+i+"] = " + valeur[i]); 

	}

}
