
/**
 * Write a description of class testRoom here.
 *
 * @author (Ediga Shimwela-BIT/6/22/010/TZ)
 * @version (a version number or a date)
 */
public class testRoom
{
     public static void main(String[]args)
    {
        Room defaultRoom = new Room();
        System.out.println("Default room:" + defaultRoom);
        Room customRoom = new Room(8.5,11.5,2);
        System.out.println("Custom room:" + customRoom);
        
        defaultRoom.setWidth(15);
        defaultRoom.setLength(-5);
        defaultRoom.setFloor(3);
        System.out.println("Updated Default Room:" + defaultRoom);
    }
}
