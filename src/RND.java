import java.util.Random;
import java.util.Scanner;

public class RND {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner data = new Scanner(System.in);
        int randInt1 = rand.nextInt(10) + 1;
        int guess;
        String playAgain = "";
        do {

            do {
                System.out.println("Guess a random number from 1 to 10: ");
                guess = data.nextInt();
                data.nextLine();
                if (guess >= 1 && guess <= 10) {
                    if (randInt1 > guess) {
                        System.out.println("Your guess is to low.");
                    } else if (randInt1 < guess) {
                        System.out.println("Your guess is to high.");
                    } else {
                        System.out.println("Your on the money!");
                    }
                } else {
                    System.out.println("Your number " + guess + " is not in the range of guessable numbers.");
                }
            } while (!(randInt1 == guess));

            System.out.println("Would you like to play again[Y/N]?");
            playAgain = data.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}