import java.util.*;

// simple data types, assign values directly, display variables, concatenate text labels

public class eventBadge
{
    public void processBadge()
    {
        int eventYear = 2018;
        int guests = 2;

        String delegate = "Jan Nelson";

        boolean presenter = true;

        System.out.println("CyberSecurity Conference Delegate");
        System.out.println(eventYear);
        System.out.println("Delegate Name : " + delegate);
        System.out.println("Guests allowed : " + guests);
        System.out.println("Stage access : " + presenter);
    }
}