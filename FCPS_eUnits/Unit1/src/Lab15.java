//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab15
   {
       public static void main(String[] args)
      {  
         Thread t2 = new Thread( new squareDancer(2,4) );
         Thread t3 = new Thread( new spinDancer(5,6) );
         Thread t4 = new Thread( new waltzer(8,8) );
         t2.start();
         t3.start();
         t4.start();
      }
   }