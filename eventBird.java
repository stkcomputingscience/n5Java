import java.util.*;

// integer arithmetic

public class eventBird
{
    public void processEarlyBird() {

        Scanner keyboard = new Scanner(System.in);

        String eventTitle = "CyberSense";
        int eventYear = 2018;
        int nextYear = 0;
        String monthName = "";
        String shortMonth = "";

        monthName  = keyboard.nextLine();
        shortMonth = monthName.substring(0,3);

        nextYear = eventYear + 1;

        System.out.println("Use this discount code before end of " + monthName + " to get an early bird price : " + shortMonth + eventTitle + nextYear);

    }
}