	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
	
    public class Lab19
   {
       public static void main(String[] args)
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("../maps/"+filename+".map");
         Display.setSize(12, 12);
         Display.setSpeed(10);
      
         Dorothy karel = new Dorothy();
         boolean found = false;
         while(!found)
         {
            karel.followPath();
            found = karel.findPath();
         }
         karel.turnAround();
         karel.move();
       }
   }