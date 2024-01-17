
/**
 * Write a description of class palindrome here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class palindrome
{
  public static void main(String[]args)
  {
      Scanner money = new Scanner(System.in);
      System.out.println("Enter a five digits intergers:");
      int number = money.nextInt();
      if(number>= 10000 && number<=99999)
      {
          int OriginalNumber = number;
          int reversedNumber = 0;
          
          while(number>0)
          {
              int digit = number % 10;
          }
          if(OriginalNumber == reversedNumber)
          {
              System.out.println("The Number:"+ OriginalNumber + "is a palidrome.");
          } else
          {
              System.out.println("Please enter a five digit intergers");
          }
      }
  }
}
