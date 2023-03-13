import java.util.*;

public class FrequencesMots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez des mots séparés par des virgules : ");
        String wordsInput = scanner.nextLine();
        String[] words = wordsInput.split(",");

        int[] frequencies = new int[words.length];

        System.out.print("Entrez le texte : ");
        String text = scanner.nextLine();
        String[] textWords = text.split(" ");

        for (String textWord : textWords) {
            for (int i = 0; i < words.length; i++) {
                if (textWord.equals(words[i])) {
                    frequencies[i]++;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " : " + frequencies[i]);
        }
    }
}