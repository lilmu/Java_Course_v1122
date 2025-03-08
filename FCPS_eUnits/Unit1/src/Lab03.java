import edu.fcps.karel2.Display;


public class Lab03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/mountain.map");
      Display.setSize(16, 16);
		Climber myGuy = new Climber(8);
      
      myGuy.turnRight();
      myGuy.move();
      
      for(int i=0;i<3;i++){
         myGuy.climbUpRight();
      }
      for(int i=0;i<2;i++){
         myGuy.climbDownRight();
      }
      myGuy.pickBeeper();
      myGuy.turnAround();
      for(int i=0;i<2;i++){
         myGuy.climbUpLeft();
      }
      for(int i=0;i<3;i++){
         myGuy.climbDownLeft();
      }
      myGuy.move();
      myGuy.turnRight();
   }

}
