import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class squareDancer extends Dancer{
   public squareDancer(){
      super();
   }
   public squareDancer(int x, int y){
      super(x,y,Display.NORTH,0);
   }
   public void danceStep(){
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
   }
}