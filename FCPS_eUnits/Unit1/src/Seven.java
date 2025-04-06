
public class Seven extends Digit{

   public Seven(int x, int y)
   {
   super (x,y);
   }
   
   public void display()
   {
      segment1_on();
      segment2_on();
      segment3_on();
      segment4_off();
      segment5_off();
      segment6_on();
      segment7_off();
   }
   
}