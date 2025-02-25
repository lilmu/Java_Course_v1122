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
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      trunLeft(); 
   }
   
   public void ClimbDownRight()
   {  
      turnRight();
      move();
      turnRight();
      move();
      move();
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnAround(); 
   }
   
   public void ClimbUpLeft()
   {  
      move();
      move();
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnLeft();
      move();
      turnRight(); 
   }
   
   public void ClimbDownLeft()
   {  
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      turnRight();
   }

}
