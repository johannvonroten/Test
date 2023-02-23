
public class Checksidanstableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []tab = {"toto", "tata", "titi"};
        String valeur = "tutu";
        boolean test = checkString(valeur, tab);
        if (test)
            System.out.println("OK");
        else
            System.out.println("Pas OK");
    }

    public static boolean check (int valeur, int[]tab){
        int i = 0;
        for(i = 0; i< tab.length; i++){
            if (tab[i] == valeur)
                return true;
        }
        return false;
    }
    public static boolean checkString (String valeur, String[]tab){
        int i = 0;
        for(i = 0; i< tab.length; i++){
            if (valeur.equals(tab[i]))
                return true;
        }
        return false;
    }
}