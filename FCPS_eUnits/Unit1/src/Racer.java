import edu.fcps.karel2.Display;


public class Racer extends Athlete{

   public Racer(int y)
   {
   super (1, y, Display.EAST, Display.INFINITY);
   }
   
   public void jumpRight()
   {
      turnLeft();
      move();
      turnRight();
      move();
      turnRight();
      move();
      turnLeft();
   }
   public void jumpLeft()
   {
      turnRight();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnRight();
   }
   
   public void sprint(int n)
   {
      for(int i=0; i<n; i++)
      {
      move();
      }
   }
   
   public void put(int n)
   {
      for(int i=0; i<n; i++)
      {
      putBeeper();
      }
   }
   
   public void pick(int n)
   {
      for(int i=0; i<n; i++)
      {
         pickBeeper();
      }
   }
   
   public void Shuttle(int spaces, int beepers)
   {
      for(int i=0; i<spaces; i++)
      {
         move();
      }
      
      for(int i=0; i<beepers; i++)
      {
         pickBeeper();
      }
      
   }
}
