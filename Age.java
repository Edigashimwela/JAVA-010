
/**
 * Write a description of class Age here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Age
{
   public static void main(String[] args)
   {
     Scanner word= new Scanner(System.in);
      System.out.print("enter your age: ");
     int age= word.nextInt();
    if (age<=1)
   {
    System.out.println("infact");
   }
   else if (age>1 && age<13)
    {
       System.out.println("child");
    }
  if (age>13 && age<20)
   {
       System.out.println("teeneger");
   }
  else
    {
    System.out.println("adult");
     }
  }
}

