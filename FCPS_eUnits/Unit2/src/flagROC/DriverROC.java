import javax.swing.JFrame;
public class DriverROC{
   public static void main(String[] args){
      JFrame frame = new JFrame("ROC_Flag");
      frame.setSize(920,650);
      frame.setLocation(400, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new flagROC());
      frame.setVisible(true);
   }
}