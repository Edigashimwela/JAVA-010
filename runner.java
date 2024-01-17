
/**
 * Write a description of class runner here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class runner
{
   public static void main(String[]args)
   {
       Scanner scanner = new Scanner(System.in);
       String[] runners = new String[3];
       int[] times = new int[3];
       for (int i= 0; i<3; i++)
       {
           System.out.print("Enter name of runner:"+(i + 1)+":");
           runners[i] = scanner.nextLine();
           
           System.out.print("Enter finishing time(in minutes) for:"+ runners[i] +":");
           times[i] = scanner.nextInt();
       }
       for(int i = 0;i<2; i++)
       {
           for(int j =0; j<2; j++)
           {
               if(times[j]>times[j+1])
               {
                   int tempTime = times[j];
                   times[j] = times[j + 1];
                   times[j + 1] = tempTime;
                   
                   String tempRunner = runners[j];
                   runners[j] = runners[j + 1];
                   runners[j + 1] = tempRunner;
                   
               }
           }
       }
       System.out.println(('i' + 1) + "." + runners['i'] + "_"+ times['i'] + "minutes");
   }
}
