import java.util.*;

// getting ready for input validation

public class eventGuess
{
    public void hiloGames() {
        Random myRandom = new Random();
        Scanner keyboard = new Scanner(System.in);

        int mystery = 0;
        int userGuess = 0;

        mystery = myRandom.nextInt(10) + 1;

        System.out.println("Enter your guess ");
        userGuess = Integer.parseInt(keyboard.nextLine());

        while (userGuess != mystery) {
            //mystery = myRandom.nextInt(10) + 1;

            System.out.println("Enter guess ");
            userGuess = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println("You guessed it!");
    }
}