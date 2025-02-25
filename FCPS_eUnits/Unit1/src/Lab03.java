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
      
      myGuy.ClimbUpRight();
      myGuy.ClimbDownRight();
      myGuy.pickBeeper();
      myGuy.ClimbUpLeft();
      myGuy.ClimbDownLeft();
   }

}
