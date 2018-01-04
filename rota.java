import java.util.*;

// updating the values in an array
public class rota
{
    Scanner keyboard = new Scanner(System.in);
    private String[] staffRota = {"Sandy", "Mandy", "Stuarty", "Wendy", "Tommy", "Freddy"};

    public void processRota()
    {
        System.out.print('\f');     // clears the terminal
        System.out.println( "Change Rota");
        for (int i = 0; i < 6; i++) {
            // display current name from array position
            System.out.println( i + " : " + staffRota[i]);
            // fetch a name form the keyboard and store it in the array / list
            staffRota[i] = keyboard.nextLine();
        }

        System.out.println( "New Rota" );
        for (int i = 0; i < 6; i++) {
            System.out.println( i + " : " + staffRota[i]);
        }
    }
}
