
public class Four extends Digit{

   public Four(int x, int y)
   {
   super (x,y);
   }
   
   public void display()
   {
      segment1_off();
      segment2_on();
      segment3_on();
      segment4_off();
      segment5_off();
      segment6_on();
      segment7_on();
   }
   
}