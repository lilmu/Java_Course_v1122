	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

   import edu.fcps.karel2.Display;
    public class Pirate extends Athlete
   {
       public Pirate()
      {
        super(1,1,Display.EAST,0);
      }
       public void approachPile()
      {
        while(!nextToABeeper()){
           move();
        }
      }
       public int numOfBeepersInPile()
      {
         int num = 0;
         while(nextToABeeper()){
            pickBeeper();
            num+=1;
         }
         return num; 
      }
       public void turnAppropriately(int beepers)
      {
         switch(beepers){
            case 1 :
               turnLeft();
               move();
               break;
            case 2 :
               turnAround();
               move();
               break;
            case 3 :
               turnRight();
               move();
               break;
            default :
               break;
          }
      }
   }