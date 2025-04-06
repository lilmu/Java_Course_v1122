import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class spinDancer extends Dancer{
   public spinDancer(){
      super();
   }
   public spinDancer(int x, int y){
      super(x,y,Display.NORTH,0);
   }
   public void danceStep(){
      turnLeft();
      turnLeft();
      turnLeft();
      turnLeft();
      turnLeft();
      turnLeft();
      turnLeft();
      turnLeft();
   }
}