  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab09
   {
       public static void go(Athlete arg)
      {  
         int count = 0;
         int current = 0;
         for(int i = 0;i<9;i++)
         {
            while(arg.nextToABeeper()){
                arg.pickBeeper();
                current +=1;
            }
            for(int j=0; j<count; j++){
                arg.putBeeper();
            }
            count = current;
            current = 0; 
            arg.move();
         }
      }
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         
         Display.openWorld("../maps/"+filename+".map");
         Display.setSize(10, 10);
         Display.setSpeed(5);
      
         go(new Athlete(1,1,Display.EAST,0));
       }
   }