
/**
 * Write a description of class AreaOfRectangle here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AreaOfRectangle
{
    public static void main(String[]args)
    {
        Scanner code = new Scanner(System.in);
        System.out.println("Enter length of rectangle 1:");
        int length1  = code.nextInt();
        
        System.out.println("Enter width of rectangle 1:");
        int width1 = code.nextInt();
        
        System.out.println("Enter length of rectangle 2:");
        int length2 = code.nextInt();
        
        System.out.println("Enter width of rectangle 1:");
        int width2 = code.nextInt();
        
        int area1 = length1 * width1;
        int area2 = length2 * width2;
        
        System.out.println("Area of rectangle one is:"+ area1);
        System.out.println("Area of rectangle two is:"+ area2);
        
        if (area1>area2)
        {
            System.out.println("area one is greater");
        }
        else if (area1<area2)
        {
            System.out.println("area two is greater");
        }
        else
        {
            System.out.println("area one and area two are the same");
        
        }
        
    }
}
