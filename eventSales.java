import java.util.*;

// arithmetic, add, multiply, round, int, double
public class eventSales
{
    public void processSales() {

        Scanner keyboard = new Scanner(System.in);

        String eventTitle = "CyberSense";

        int MondaySales = 0;
        int TuesdaySales = 0;
        int totalSales = 0;

        double sessionPrice = 12.35;
        double totalIncome = 0;
        double averageSales = 0;
        double averageIncome = 0;

        System.out.println("Please enter the number of morning sales : ");
        MondaySales  = Integer.parseInt(keyboard.nextLine());

        System.out.println("Please enter the number of afternoon sales : ");
        TuesdaySales  = Integer.parseInt(keyboard.nextLine()); 

        totalSales = (MondaySales + TuesdaySales);
        totalIncome = totalSales * sessionPrice;
        
        // try divide by 2 and the 2.0
        averageSales = totalSales / 2.0;
        averageIncome = totalIncome / 2.0;
        
        // try using 100 then 100.0, also 10.0, 1000.0
        averageIncome = Math.round(averageIncome * 100.0) / 100.0;

        System.out.println("Total income : " + totalIncome);
        System.out.println("Average income : " + averageIncome);
        System.out.println("Average sales : " + averageSales);        

    }
}