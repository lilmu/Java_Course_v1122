import edu.fcps.karel2.Display;

public class Democrat extends MazeEscaper{
   public void walkDownCurrentSegment(){
      while(frontIsClear() && !leftIsClear()&& !nextToABeeper()){
         move();
      }
   }
   public void turnToTheNextSegment(){
      while(leftIsClear()&& !nextToABeeper()){
         turnLeft();
         move();
      }
      while(!frontIsClear()&& !nextToABeeper()){
         turnRight();
      }
   }
}