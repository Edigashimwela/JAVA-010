
/**
 * Write a description of class EmployeeEarning here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
public class EmployeeEarning
{
    public static void main(String[]args)
    {
        double annualSalary = 32500.0;
        
        int payPeriodPerMonth = 2;
        int payPeriodPerYearTwiceAMonth = 24;
        
        double grossPayTwicePerAMonth = annualSalary / payPeriodPerYearTwiceAMonth;
        System.out.println("Gross pay for each pay period (two times a month):$"+grossPayTwicePerAMonth);
        
        int payPeriodPerYearBiWeekly = 26;
        double grossPayBiWeekly = annualSalary / payPeriodPerYearBiWeekly;
        System.out.println("Gross pay for each period(Bi-Weekly):$"+ grossPayBiWeekly);
    }
}
