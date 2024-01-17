
/**
 * Write a description of class postiveNumber here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class postiveNumber
{
    public static void main(String[]args)
    {
        Scanner interger = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        
        System.out.print("Enter a series of positive number(while negative number to end):");
        do
        {
            System.out.print("Enter a number:");
            number = interger.nextInt();
            if(number>=0)
            {
                sum +=number;
            }
        }while(number>=0);
        System.out.print("Sum of positive numbers entered is:" + sum);
    }
}
