
/**
 * Write a description of class eligibility here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class eligibility
{
   public static void main(String[]args)
   {
       Scanner citizen = new Scanner(System.in);
       System.out.print("Enter Your Age;");
       int age = citizen.nextInt();
       
       System.out.print("Enter years of citizenship:");
       int yearsOfCitizenship = citizen.nextInt();
       
       boolean senateEligible = age>=30 && yearsOfCitizenship>=9;
       boolean houseEligible = age>=25 && yearsOfCitizenship>=7;
       
       System.out.println("Senate Eligibility:" + (senateEligible?"Eligible":"Not Eligible"));
       System.out.println("House Eligibility:" + (houseEligible?"Eligible":"Not Eligible"));
       
   }
}
