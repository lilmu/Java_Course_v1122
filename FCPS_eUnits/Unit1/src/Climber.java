import edu.fcps.karel2.Display;


public class Climber extends Athlete{

   public Climber()
   {
   super ();
   }
   
   public Climber(int x)
   {
   super (x, 1, Display.NORTH, 1);
   }
   
   public void ClimbUpRight()
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
}
