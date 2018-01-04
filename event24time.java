import java.util.*;

// data type conversion, string to int

public class event24time
{
    public void process24hourTime() {

        String exitTime = "8pm";
        String hour = exitTime.substring(0,1);
        int exitHour = Integer.parseInt(hour);
        int exit24Time = exitHour + 12;
        System.out.println("The exit time is : " + exit24Time + " hours");
    }
}