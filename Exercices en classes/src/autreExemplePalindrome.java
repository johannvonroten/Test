import java.util.Scanner;

public class autreExemplePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(palindrome("sugus"));

	}
	
	public static boolean palindrome(String ch)
	
	{	
		for (int i=0 ; i<ch.length()/2 ; i++){
					
			if (ch.charAt(i) != ch.charAt(ch.length()-1 -i))
				return false;			
		}
		
		return true;
		
	}
public static boolean palindromeBis(String ch)
	
	{	
		String inverse = inverseChaine(ch);
		
		return ch.equals(inverse);
		
	}

public static String inverseChaine(String ch) {
	String res = "";
	
	for(int i=ch.length()-1 ; i>=0; i--) {
		res = res + ch.charAt(i);
	}
	return res;
}
public static String inverseChaineBis(String ch) {
	char[] tab = new char[ch.length()];
	
	int indiceTab = 0;
	
	for(int i=ch.length()-1 ; i>=0; i--) {
		tab[indiceTab] = ch.charAt(i);
		indiceTab++;		
	}
	return new String(tab);
}

}