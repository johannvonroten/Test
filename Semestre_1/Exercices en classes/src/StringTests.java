
public class StringTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="CIAO", maChaine = "salut les beaux oindus", myString = "Le  beau cheval hennit";
		char c='a';
		
//		"Ecrire" verticalement caractère par caractère		
		for (int i = 0 ; i<maChaine.length() ; i++ )	
			System.out.println(maChaine.charAt(i));
		
//		s.charAt(2) = 'm'; Ne fonctionne pas, on ne peut pas changer une chaine de caractère
		
		
//		Chercher le nombre de fois que un caractère est dans une chaine de caractères
		int pos = myString.indexOf('u'), cpt=0;
//		initialisation de pos
		pos = myString.indexOf('u');
//		Boucle qui se positionne correctement
		while (pos!= 1) {
		++cpt;
		pos = myString.indexOf('u', pos+1);
		System.out.println(cpt);

		}
		
		
		
		
		
		
		
		
		
	}

}
