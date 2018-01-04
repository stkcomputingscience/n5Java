import java.util.*;

// conditional loop, final value to stop

public class eventSession
{
    public void sessionList() {
        Scanner keyboard = new Scanner(System.in);

        String userSession = "";
        int sessions = 0;

        userSession = "Keynote";
        sessions = sessions + 1;

        System.out.println("You have been booked for the " + userSession + " session.");
        System.out.println("Number of sessions is " + sessions);

        while (!userSession.equals("Wrapup")) {
            System.out.println("Enter any other session you want (Wrapup will be the last) ");
            userSession = keyboard.nextLine();
            sessions = sessions + 1;

            System.out.println("You have been booked for the " + userSession + " session.");
            System.out.println("Number of sessions is " + sessions);
        }
    }
}
