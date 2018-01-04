import java.util.*;

//conditional loop, complex conditions AND
public class liveDemo
{
    public void processDemo() {
        Scanner keyboard = new Scanner(System.in);
        String userMovement = "";
        System.out.print('\f');     // clears the terminal

        int capacity = 11;
        int present = 0;

        // demonstrator arrives
        present = 1;
        System.out.println("There are  " + present + " people in the demo.");

        while (present > 0) {
            System.out.print("Enter arrive or leave to open the door : ");
            userMovement = keyboard.nextLine();

            if (userMovement.equals("arrive") && present < capacity) {
                present = present + 1;
            }
            else {

                if (userMovement.equals("leave") && present > 0) {
                    present = present - 1;
                }
                else
                {
                    System.out.println("That action is not possible, please choose again");
                }
            }

            if (present == capacity) {
                System.out.println("Demo full.");
            }

            System.out.println("There are  " + present + " people in the demo.");
        }

        System.out.println("There are  " + present + " people in the demo. Demo over");
    }
}
