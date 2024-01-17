
/**
 * Write a description of class digit here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class digit
{
    public static void main(String[]args)
    {
        Scanner reverse = new Scanner(System.in);
        System.out.print("Enter a 2-digit integer");
        int x = reverse.nextInt();
        int rightDigit = x % 10;
        int leftDigit = x / 10;
        int y = rightDigit * 10 + leftDigit;
        int sum = x + y;
        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
        System.out.println("x + y:"+ sum);
    }
}
