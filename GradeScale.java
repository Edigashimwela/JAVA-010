
/**
 * Write a description of class GradeScale here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeScale
{
   public static void main(String[]args)
   {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter Your quiz Score:");
       int quizScore = scanner.nextInt();
       
       char grade;
       switch(quizScore)
       {
           case 5:
               grade = 'A';
               break;
               case 4:
               grade = 'B';
               break;

               case 3:
               grade = 'C';
               break;

               case 2:
               grade = 'D';
               break;
               case 1:
               grade = 'F';
               break;
               default:
                   System.out.println("Please enter a valid quiz score under range of 0-5.");
                   return;

       }
       System.out.println("The Grade for the Quiz score" + quizScore + "is" +grade);
   }
}
