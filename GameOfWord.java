
/**
 * Write a description of class GameOfWord here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GameOfWord
{
    public static void main(String[]args)
   {
       Scanner word = new Scanner(System.in);
       System.out.println("Enter Your Name:");
       String name = word.nextLine();
       
       System.out.println("Enter Your age:");
       int age = word.nextInt();
       
       System.out.println("Enter Your City:");
       String city = word.nextLine();
       
       System.out.println("Enter college name:");
       String college = word.nextLine();
       
       System.out.println("Enter your professional:");
       String professional = word.nextLine();
       
       System.out.println("Enter your animal;");
       String animal = word.nextLine();
       
       System.out.println("Enter pets name:");
       String pets = word.nextLine();
       
       System.out.println("There once was a person named" +  name  +" who lived in city "+  city  + " at the age of " +  age + name  + " went at " +  college +  name  +" graduated and went to work as a " + professional  + " then, " + name +" adopted an " +  animal + " named " + pets  + " They both lived happily ever after ");
    }
}
