
/**
 * Write a description of class distance here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class distance
{
   public static void main(String[]args)
   {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter Speed of vehicle in mph:");
       int vehicleSpeed = scanner.nextInt();
       
       System.out.print("Enter travelled hours:");
       int hour = scanner.nextInt();
       
       System.out.println("Hour    Distance");
       for(int i = 1; i<=hour; i++)
       {
           int distance = vehicleSpeed * i;
           System.out.println(i + "        "+ distance);
       }
   }
}
