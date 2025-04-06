
public class Five extends Digit{

   public Five(int x, int y)
   {
   super (x,y);
   }
   
   public void display()
   {
      segment1_on();
      segment2_off();
      segment3_on();
      segment4_on();
      segment5_off();
      segment6_on();
      segment7_on();
   }
   
}