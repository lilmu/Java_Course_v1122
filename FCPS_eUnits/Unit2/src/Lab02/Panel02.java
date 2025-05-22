import javax.swing.*;
import java.awt.*;
public class Panel02 extends JPanel{
   public void paintComponent(Graphics g){
      g.setColor(Color.YELLOW);
      g.fillRect(65, 40, 160, 200);
      int r = 10;
      int xCircle = 65;
      int yCircle = 40;
      for(int i = 0; i <= 160; i=i+2*r){
         g.fillOval(xCircle-r+i,yCircle-r,2*r,2*r);
      }
      for(int i = 0; i <= 200; i=i+2*r){
         g.fillOval(xCircle-r+160,yCircle-r+i,2*r,2*r);
      }
      for(int i = 0; i <= 160; i=i+2*r){
         g.fillOval(xCircle-r+i,yCircle-r+200,2*r,2*r);
      }
      for(int i = 0; i <= 200; i=i+2*r){
         g.fillOval(xCircle-r,yCircle-r+i,2*r,2*r);
      }
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(), 82, 55, null);

      g.setFont(new Font("Comic Sans MS",Font.BOLD, 27));
      g.setColor(Color.YELLOW);
      g.drawString("Our Fearless Leader",7, 300);
   }
}
