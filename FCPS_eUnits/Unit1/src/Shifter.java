	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      public void workCorner(){
         while(nextToABeeper()){
            pickBeeper();
         }
         for(int i=0;i<myBeepers;i++){
            putBeeper();
         }
         myBeepers = getBeepers();
      }
      public void moveOneBlock(){
         move();
      }
      public void turnToTheRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();
      }
      public void turnToTheNorth()
      {
         if(facingEast()){
            turnLeft();
         }
         else if(facingWest()){
            turnLeft();
            turnLeft();
            turnLeft();
         }
         else if(facingSouth()){
            turnLeft();
            turnLeft();
         }       
      }
      public void run(){
         turnToTheNorth();
         turnToTheRight();
         for(int i=0;i<8;i++){
            workCorner();
            moveOneBlock();
         }
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
   }