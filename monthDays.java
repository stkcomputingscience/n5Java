import java.util.*;

//traverse String array, display all elements
public class monthDays
{
    public void processMonths()
    {
        Scanner keyboard = new Scanner(System.in); 
        // sum the content of an array, calculate average, double, rounding
        String[] monthName = {"Jan", "Feb", "Mar", "Apr", "Msy", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.print('\f');     // clears the terminal

        System.out.println("There are " + monthName.length + " months");

        for (int i = 0; i < monthName.length; i++) {
            System.out.println( (i+1) + " : " + monthName[i]);
        }
    }
}
