
public class weekdays
{
    // fixed loop, array index using loop, display array content
    private String[] daysoftheweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public void processdays()
    {
        for (int i = 0; i < 7; i++) {
            System.out.println( i + " : " + daysoftheweek[i]);
        }
    }
}
