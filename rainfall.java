
/**
 * Write a description of class rainfall here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class rainfall
{
    public static void main(String[]args)
    {
        Scanner calculator = new Scanner(System.in);
        System.out.print("Enter number of years:");
        int yearsNo = calculator.nextInt();
        
        int totalMonths = yearsNo * 12;
        double totalRainfall = 0;
        
        for(int year = 1; year<=yearsNo; year++)
        {
            for(int month = 1; month<=12; month++)
            {
                System.out.print("Enter inches of rainfall per year:"   + year + "month" + month +":");
                double rainfall = calculator.nextDouble();
                totalRainfall += rainfall;
            }
        }
        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nNumber of months:"+ totalMonths);
        System.out.println("Total inches of rainfall is:"+ totalRainfall);
        System.out.println("Average rainfall per month:"+ averageRainfall + "inches");
    }
}
