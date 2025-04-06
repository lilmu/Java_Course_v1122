import edu.fcps.karel2.Display;


public class BoxTopRacer extends Racer{

   public BoxTopRacer(int y)
   {
   super (y);
   }
   
   public void jumpRight()
   {
      turnLeft();
      while(!rightIsClear()){
      move();
      }
      turnRight();
      move();
      while(!rightIsClear()){
      move();
      }
      turnRight();
      while(frontIsClear()){
      move();
      }
      turnLeft();
   }
   public void jumpLeft()
   {
      turnRight();
      while(!leftIsClear()){
      move();
      }
      turnLeft();
      while(!leftIsClear()){
      move();
      }
      turnLeft();
      while(frontIsClear()){
      move();
      }
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
