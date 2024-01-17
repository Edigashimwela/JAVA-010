
/**
 * Write a description of class table here.
 *
 * @author (Ediga Shimwela-BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class table
{
     public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        
        for(int i=1;i<=number;i++){
            if(number<=2){
                int second=i*2;
                System.out.println(i+"\t"+second);
            }else if(number<=3){
                int two=i*2;
                int three=i*3;
                System.out.println(i+"\t"+two+"\t"+three);
            }else if(number<=4){
                int Two=i*2;
                int Three=i*3;
                int four=i*4;
                System.out.println(i+"\t"+Two+"\t"+Three+"\t"+four);
            }else if(number<=5){
                int five=i*5;
                int tWo=i*2;
                int tHree=i*3;
                int Four=i*4;
                System.out.println(i+"\t"+tWo+"\t"+tHree+"\t"+Four+"\t"+five);
            }else if(number<=6){
                int Five=i*5;
                int twO=i*2;
                int THree=i*3;
                int FOur=i*4;
                int six=i*6;
                System.out.println(i+"\t"+twO+"\t"+THree+"\t"+FOur+"\t"+Five+"\t"+six);
            }else if(number<=7){
                int FIve=i*5;
                int tWO=i*2;
                int THRee=i*3;
                int FOUr=i*4;
                int siX=i*6;
                int seven=i*7;
                System.out.println(i+"\t"+tWO+"\t"+THRee+"\t"+FOUr+"\t"+FIve+"\t"+siX+"\t"+seven);
            }
    }
}
}
