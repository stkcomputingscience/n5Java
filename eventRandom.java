import java.util.*;

// memorable phrase random character check

public class eventRandom
{
    public void processRandom() {
        Random myRandom = new Random();
        Scanner keyboard = new Scanner(System.in);

        int guess = 0;
        String userCharacter = "";
        String securityWord = "cybersecurity";
        String securityCharacter = "";

        for (int i = 0; i < 3; i++) {
            guess = myRandom.nextInt(securityWord.length()-1);
            System.out.println("enter character " + guess);

            userCharacter = keyboard.nextLine();
            securityCharacter = securityWord.substring(guess-1,guess);

            if (userCharacter.equals(securityCharacter)) {
                System.out.print(" OK ");
            }
            else
            {
                System.out.print(" ERROR ");
            }
            System.out.println(guess + " " + securityCharacter);
        }
    }
}