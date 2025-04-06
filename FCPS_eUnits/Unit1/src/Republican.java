import edu.fcps.karel2.Display;

public class Republican extends MazeEscaper{
   public void walkDownCurrentSegment(){
      while(frontIsClear() && !rightIsClear()&& !nextToABeeper()){
         move();
      }
   }
   public void turnToTheNextSegment(){
      while(rightIsClear()&& !nextToABeeper()){
         turnRight();
         move();
      }
      while(!frontIsClear()&& !nextToABeeper()){
         turnLeft();
      }
   }
}