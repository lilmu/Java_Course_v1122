import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class waltzer extends Dancer{
   public waltzer(){
      super();
   }
   public waltzer(int x, int y){
      super(x,y,Display.NORTH,0);
   }
   public void danceStep(){
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
   }
}