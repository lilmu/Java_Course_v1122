import edu.fcps.karel2.Display;

public class Lab11
   {
       public static void main(String[] args) 
      {
         Display.setSize(36, 32);
         Display.setSpeed(10);
         
         new Zero(1,9).display();
         new Six(7,9).display();
         new Four(13,9).display();
         new Four(19,9).display();
         new Two(25,9).display();
         new Zero(31,9).display();
       }
   }