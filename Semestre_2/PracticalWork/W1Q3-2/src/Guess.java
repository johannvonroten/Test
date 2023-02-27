import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {

        int guess, iGuess = 0, tour = 0;
        guess = (int) (Math.random() * 1000);

        while (iGuess != guess) {
            tour++;
            System.out.println("Guess a number between 0 and 1000: ");
            Scanner input = new Scanner(System.in);
            iGuess = input.nextInt();
            if (iGuess > guess) {
                System.out.println("Too high, try again");
            } else if (iGuess < guess) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("You guessed it! in " + tour + " tries");
            }
        }
    }
}