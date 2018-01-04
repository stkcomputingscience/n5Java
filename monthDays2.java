import java.util.*;

// sum the content of an array, calculate average, double, rounding
public class monthDays2
{
    public void sumDays()
    {
        Scanner keyboard = new Scanner(System.in); 

        String[] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int total = 0;
        double average = 0.0;

        System.out.print('\f');     // clears the terminal

        for (int i = 0; i < monthName.length; i++) {
            System.out.print( (i+1) + " how many days in " + monthName[i] + " : ");
            total = total + Integer.parseInt(keyboard.nextLine());
        }

        average = total / 12.0;
        average = Math.round(average * 100.0) / 100.0;

        System.out.println("There are " + total + " days in these months");
        System.out.println("The average is " + average + " days in these months");
    }
}