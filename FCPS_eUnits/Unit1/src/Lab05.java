import edu.fcps.karel2.Display;


public class Lab05 {

   public static void completeTask(Racer arg)
   {
      arg.move();
      arg.jumpRight();
      arg.sprint(2);
      arg.pick(7);
      arg.sprint(2);
      arg.pick(5);
      arg.sprint(2);
      arg.pick(3);
      arg.turnAround();
      arg.sprint(6);
      arg.jumpLeft();
      arg.move();
      arg.put(15);
      arg.turnAround();
      arg.move();
   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(7);
      
		Racer P1 = new Racer(1);
      Racer P2 = new Racer(4);
      Racer P3 = new Racer(7);
      
      completeTask(P1);
      completeTask(P2);
      completeTask(P3);
      
      
      
 
     
     
   }

}
