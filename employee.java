
/**
 * Write a description of class employee here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class employee
{
   public static void main(String[]args)
   {
       Scanner gross = new Scanner(System.in);
       
       System.out.print("Enter Employee's ID:");
       int employeeId = gross.nextInt();
       
       System.out.print("Enter hourly rate of pay:$");
       double hourlyRate = gross.nextDouble();
       
       System.out.print("Enter number of hour worked for the week:");
       double workedHours = gross.nextDouble();
       
       double regularHours = Math.min(40, workedHours);
       double overtimeHours = Math.max(0,workedHours-40);
       
       double regularPay = regularHours*hourlyRate;
       double overtimePay = overtimeHours*1.5*hourlyRate; 
       double grossPay = regularPay + overtimePay;
       double incomeTax = (grossPay>500.0)?0.15*grossPay:0;
       double parkingCharge = 20.00;
       double deductions = incomeTax + parkingCharge;
       double netPay = grossPay-deductions;
       
       System.out.println("ID Number:\t\t"+ employeeId);
       System.out.println("Pay rate:\t\t"+ hourlyRate);
       System.out.println("Regular hours :\t\t"+ regularHours);
       System.out.println("Overtime hours:\t\t"+ overtimeHours);
       System.out.println("Total hours:\t\t"+ workedHours);
       System.out.println("Regular pay:\t\t"+ regularPay);
       System.out.println("Overtime pay:\t\t"+ overtimePay);
       System.out.println("Gross pay:\t\t"+ grossPay);
       System.out.println("Deduction:\t\t"+ deductions);
       System.out.println("Net Pay:\t\t"+ netPay);
   }
}
