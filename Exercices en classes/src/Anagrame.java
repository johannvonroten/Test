import java.util.Scanner;

public class Anagrame {

		public static void main(String[] args) {
	        Scanner scan = new Scanner (System.in);
	        System.out.println("Entrer un mot :");
	        String mot1 = scan.next();
	        System.out.println("Entrer un autre mot :");
	        String mot2 = scan.next();
	        boolean test = anagrame(mot1, mot2);
	        if (test)
	            System.out.println("OK");
	        else
	            System.out.println("Pas OK");
	        scan.close();
	    }
	    public static boolean anagrame (String mot1, String mot2){
	        if (mot1.length()!= mot2.length())
	            return false;
	        int i = 0;
	        int j = 0;
	        boolean check = false;
	        for (i = 0; i< mot1.length(); i++){
	            for (j = 0; j< mot2.length(); j++){
	                if (mot1.charAt(i) == mot2.charAt(j)){
	                    check = true;

	                    mot2 = mot2.replace(mot2.charAt(j), ' ');

	                   }
	                    check = true;
	                
	            }
	            if (check == false)
	                return false;
	            check = false;
	        }
	    return true;
	    }
	}

	 
	

