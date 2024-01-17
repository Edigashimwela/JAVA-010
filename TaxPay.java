
/**
 * Write a description of class TaxPay here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TaxPay
{
    public static void main(String[]args)
    {
        Scanner property = new Scanner(System.in);
        
        System.out.print("Enter actual value of your property:");
        double realValue = property.nextDouble();
        
        System.out.print("Enter tax rate of each assessed value($100.00):");
        double taxRate = property.nextDouble();
        double assessedValue = 0.6 * realValue;
        double annualPropertyTax = (assessedValue / 100) * taxRate;
        System.out.println("The actual value of propertytax for a property valued at $100000.00: is"+ realValue + annualPropertyTax);
        
        
    }
}
