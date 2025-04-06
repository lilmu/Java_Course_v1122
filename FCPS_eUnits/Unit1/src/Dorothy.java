import edu.fcps.karel2.Display;

public class Dorothy extends Athlete{
   public Dorothy(){
      super(2,2,Display.EAST,0);
   }
   public void followPath(){
      while(nextToABeeper()&&frontIsClear()){
         move();
      }
   }
   public boolean findPath(){
      if(!nextToABeeper()){
         turnAround();
         move();
      }
      turnLeft();
      if(frontIsClear()){
         move();
         if(nextToABeeper()){
            return false;
         }
      }
      turnAround();
      move();
      if(frontIsClear()){
         move();
         if(nextToABeeper()){
            return false;
         }
      }
      return true;
      
   }
}