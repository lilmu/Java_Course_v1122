import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public abstract class Digit{
   private Athlete myLED;
   public Digit(int x,int y)
   {
      myLED = new Athlete(x,y,Display.EAST,Display.INFINITY);
   }
   public abstract void display();
   public void segment1_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment1_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment2_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();  
   }
   public void segment2_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();  
   }
   public void segment3_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment3_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment4_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment4_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnRight();  
   }
   public void segment5_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();  
   }
   public void segment5_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
   }
   public void segment6_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.turnAround();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnLeft();
   }
   public void segment6_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnAround();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.turnLeft();  
   }
   public void segment7_on()
   {
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
      myLED.putBeeper();
      myLED.move();
   }
   public void segment7_off()
   {
      myLED.move();
      myLED.move();
      myLED.move();
      myLED.move(); 
   }
}
