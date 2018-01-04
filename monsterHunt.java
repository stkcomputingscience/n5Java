import java.util.*;

// game context, use keyboard to select index
public class monsterHunt
{
    Scanner keyboard = new Scanner(System.in);

    Random rand = new Random();

    private String[] moveList = {"Up", "Down", "Left", "Right"};
    int choice = 0;
    int monster = 0; 

    public void processHunt()
    {
        System.out.print('\f');     // clears the terminal

        System.out.println("Move options");
        System.out.println(0 + " " + moveList[0]);
        System.out.println(1 + " " + moveList[1]);
        System.out.println(2 + " " + moveList[2]);
        System.out.println(3 + " " + moveList[3]);

        monster  = rand.nextInt(3);

        System.out.print("Which option? : ");
        choice = Integer.parseInt(keyboard.nextLine());

        System.out.println("moving .. " + moveList[choice]);

        if (choice == monster) {
            System.out.println("oh dear! there was a monster");
        }
        else {
            System.out.println("phew! you escaped");
        }
    }
}