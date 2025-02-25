import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Athlete extends Robot{

   public Athlete()
   {
   super (1, 1, Display.NORTH, Display.INFINITY);
   }
   
   public Athlete(int x, int y, int dir, int Beeper_num)
   {
   super (x, y, dir, Beeper_num);
   }
   
   public void turnRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   
   public void turnAround()
   {
      turnLeft();
      turnLeft();
   }
}
