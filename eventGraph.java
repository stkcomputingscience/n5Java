
public class eventGraph
{
    // fixed loop

    public void processGraph()
    {
        int bars;
        int red = 13;
        int blue = 24;
        int green = 4;

        for (int i=0; i<=red; i++) {
            System.out.print("*");
        }
        System.out.println(" red");

        for (int i=0; i<=blue; i++) {
            System.out.print("#");
        }
        System.out.println(" blue");

        for (int i=0; i<=green; i++) {
            System.out.print("+");
        }
        System.out.println(" green");
    }

}
