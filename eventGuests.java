import java.util.*;

// text input, boolean value

public class eventGuests
{
    public void processEvent2() { 

        String delegate = "Jan Nelson";
        int guests = 2;
        boolean presenter = true;
        int eventYear = 2018;

        String twitter = "@CyberBusters";
        String enventTitle = "CyberSense" + eventYear; 

        System.out.println(enventTitle + " Conference Delegate");
        System.out.println("Delegate Name : " + delegate);
        System.out.println("Guests allowed : " + guests);
        System.out.println("Stage access : " + presenter);
        System.out.println("Follow me at : " + twitter);

        delegate = "Omer Nelson";
        guests = 0;
        presenter = false;

        twitter = "@whiteHatter";
        guests = 2;

        System.out.println("CyberSecurity Conference Delegate");
        System.out.println("Delegate Name : " + delegate);
        System.out.println("Guests allowed : " + guests);
        System.out.println("Stage access : " + presenter);
    }
}