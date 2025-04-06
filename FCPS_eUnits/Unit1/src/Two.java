
public class Two extends Digit{

   public Two(int x, int y)
   {
   super (x,y);
   }
   
   public void display()
   {
      segment1_on();
      segment2_on();
      segment3_off();
      segment4_on();
      segment5_on();
      segment6_off();
      segment7_on();
   }
   
}