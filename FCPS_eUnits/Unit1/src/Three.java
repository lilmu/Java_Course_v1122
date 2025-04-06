
public class Three extends Digit{

   public Three(int x, int y)
   {
   super (x,y);
   }
   
   public void display()
   {
      segment1_on();
      segment2_on();
      segment3_on();
      segment4_on();
      segment5_off();
      segment6_off();
      segment7_on();
   }
   
}