import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez une chaîne de caractères : ");
    String str = scanner.nextLine();

    // Affiche le résultat de la comparaison de la chaîne dans les deux sens
    System.out.println("La chaîne est " + (isPalindrome(str) ? "" : "pas ") + "un palindrome.");
        
  }
  public static boolean isPalindrome(String str) {
    int length = str.length();

    // Compare la chaîne dans les deux sens
    for (int i = 0; i < length / 2; i++) {
      if (str.charAt(i) != str.charAt(length - i - 1)) {
        return false;
      }
    }

    return true;
  }
}