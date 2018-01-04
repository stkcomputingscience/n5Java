import java.util.*;

// strings, int, System.out.println, concatenate to make new string, initial values

public class eventLive
{
    public void processEventLive() {

        String eventTitle = "CyberSense";
        int year = 2018;

        String hashTag = "";
        String twitterHandle = "";
        String email = "";

        twitterHandle = "@" + eventTitle;
        hashTag = "#" + eventTitle + year;
        email = "helpdesk@" + eventTitle + ".com";

        System.out.println(hashTag);
        System.out.println(twitterHandle);
        System.out.println(email);
    }
}