import java.util.*;

// conditional - string equality

public class eventWiFi
{
    public void checkCode() {
        Scanner keyboard = new Scanner(System.in);

        String eventTitle = "CyberSense";
        String weekDay = "";
        String wifiCode = "";
        String userCode = "";

        weekDay  = "Monday";
        wifiCode = weekDay.substring(0,3) + eventTitle;

        System.out.println("Please enter the WiFi code for today:");
        userCode  = keyboard.nextLine();

        if (userCode.equals(wifiCode)) {
            System.out.println("You are connected to WiFi");
        }
        else {
            System.out.println("Please check the WiFi code for today");
        }
    }
}