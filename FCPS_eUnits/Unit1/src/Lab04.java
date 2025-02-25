import edu.fcps.karel2.Display;


public class Lab04 {

   public static void takeTheField(Athlete arg)
   {
   arg.move();
   arg.move();
   arg.move();
   arg.move();
   arg.turnRight();
   arg.move();
   arg.move();
   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/arena.map");
      Display.setSize(10, 10);
      
		Athlete P1 = new Athlete();
      Athlete P2 = new Athlete();
      Athlete P3 = new Athlete();
      Athlete P4 = new Athlete();
      Athlete P5 = new Athlete();
      Athlete P6 = new Athlete();
      Athlete Coach = new Athlete(2,7,Display.EAST,0);
      
      takeTheField(P1);
      P1.move();
      P1.move();
      P1.move();
      P1.turnLeft();
      P1.move();
      P1.move();
      P1.turnAround();
      
      takeTheField(P2);
      P2.move();
      P2.move();
      P2.move();
      P2.move();
      P2.move();
      P2.turnLeft();
      P2.move();
      P2.turnAround();
      
      takeTheField(P3);
      P3.move();
      P3.move();
      P3.move();
      P3.move();
      P3.turnRight();
      
      takeTheField(P4);
      P4.move();
      P4.move();
      P4.move();
      P4.turnRight();
      
      takeTheField(P5);
      P5.move();
      P5.move();
      P5.turnRight();
      
      takeTheField(P6);
      P6.turnLeft();
      P6.move();
      P6.turnRight();
      P6.move();
      P6.turnRight();
     
     
   }

}
