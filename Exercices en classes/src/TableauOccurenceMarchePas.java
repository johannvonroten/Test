
public class TableauOccurenceMarchePas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0 ; i<256 ; i++) {
			System.out.println(i + "\t" +(char)i + "\t");}
		
		String ch = "Bonjour, je m'appelle Johann";
		
			int [] tab = frequence (ch);

			for (int i=0 ; i<256 ; i++) {
				System.out.println(i + "\t" +(char)i + "\t");}
	}
	
	public static int [] frequence(String ch1) {

		int [] stat = new int [256];
		
		for (int i=0 ; i<256 ; i++) {
			char c = ch1.charAt(i);
			stat[c]++;

		}
		return stat;
}
	
	
	
	
	
	
	
}






