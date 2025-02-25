import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/maze.map");
      Display.setSize(8, 8);
		Athlete myGuy = new Athlete();
      
      myGuy.putBeeper();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnRight();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnRight();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnLeft();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnLeft();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnRight();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnRight();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnLeft();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnLeft();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.turnRight();
      myGuy.move();
      myGuy.putBeeper();
      myGuy.move();
	}

}
