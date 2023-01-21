
public class StringExoMaxime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webContent = "La situation Une des règles de base pour qu’un référencement de pages Web fournisse des résultats intéressants lors d’une recherche via un moteur de recherche consiste à s’assurer que des mots-clés, introduits dans l’en-tête des pages Web, soient utilisés dans le contenu de la page Web. Votre tâche Ecrire un programme Java qui permet de calculer la fréquence d’apparition de mots donnés dans un texte. Le programme fonctionnera de la manière simplifiée suivante : a. Une chaîne de caractères est saisie avec plusieurs mots séparés par des virgules. b. Une seconde chaîne est saisie et représente le contenu de la page Web. c. Votre programme va ensuite calculer et afficher le nombre d’apparitions de chaque mot de la 1ère chaîne dans le texte.";

	    String keyWords [] = {"règle", "chaîne", "programme", "moteur", "mots"};

	    findOccurences(webContent, keyWords);
	}
	public static void findOccurences(String s, String [] keyWords){


	    int [] cpt = new int [keyWords.length];
	    int i=0;


	    for (i = 0; i < keyWords.length;i++) {
	        int lastIndex = 0;
	        while (lastIndex != -1) {
	            lastIndex = s.indexOf(keyWords[i], lastIndex);

	            if (lastIndex != -1) {
	                cpt[i]++;
	                lastIndex += keyWords[i].length();
	            }


	        }
	    }
	    for(i =0;i<keyWords.length;i++){
	        System.out.println(keyWords[i]+ " " + cpt[i]);
	    }
	}
}