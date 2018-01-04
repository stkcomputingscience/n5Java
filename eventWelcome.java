import java.util.*;

// substring, input string value

public class eventWelcome
{
    public void processEventWelcome() {
        Scanner keyboard = new Scanner(System.in);

        String eventTitle = "CyberSense";
        String weekDay = "";
        String shortDay = "";

        // concatenation
        System.out.println("Please enter the name of the day:");
        weekDay  = keyboard.nextLine();
        System.out.println("Hi, have an awesome : " + weekDay + " at " + eventTitle);

        // substring
        shortDay = weekDay.substring(0,3);
        System.out.println("WiFi code today is : " + shortDay + eventTitle);
    }
}