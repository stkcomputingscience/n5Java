public class weekdays2
{
    // selective display from an array
    // length of name, day starts with T, not T, S, S or T
    
    private String[] daysoftheweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public void processdays()
    {
        System.out.print('\f');     // clears the terminal
        for (int i = 0; i < 7; i++) {
            if (daysoftheweek[i].length() > 7) {
                System.out.print( i + " : " + daysoftheweek[i]);
                System.out.println( daysoftheweek[i].length());
            }
        }
    }
}