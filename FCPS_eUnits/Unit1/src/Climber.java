import edu.fcps.karel2.Display;


public class Climber extends Athlete{

   public Climber()
   {
   super ();
   }
   
   public Climber(int x)
   {
   super (x, 1, Display.NORTH, 0);
   }
   
   public void ClimbUpRight()
   {
      turnLeft();
      move();
      move();
      turnRight(); 
      move();
   }
   
   public void ClimbDownRight()
   {  
      move();
      turnRight();
      move();
      move();
      turnLeft();
   }
   
   public void ClimbUpLeft()
   {  
      turnRight();
      move();
      move();
      turnLeft();
      move();
   }
   
   public void ClimbDownLeft()
   {  
      move();
      turnLeft();
      move();
      move();
      turnRight();
   }
}