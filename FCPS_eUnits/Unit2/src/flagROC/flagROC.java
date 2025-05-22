import javax.swing.*;
import java.awt.*;
public class flagROC extends JPanel{
   public final double flagW = 900; 
   public final double flagH = 600;
   public final double[][] outerCircle = { {1,0},{0.866,0.5},{0.5,0.866},
                                             {0,1},{-0.5,0.866},{-0.866,0.5},
                                             {-1,0},{-0.866,-0.5},{-0.5,-0.866},
                                             {0,-1},{0.5,-0.866},{0.866,-0.5}
                                           };
   public final double[][] innerCircle = {   {0.966,-0.259},
                                             {0.966,0.259},{0.707,0.707},{0.259,0.966},
                                             {-0.259,0.966},{-0.707,0.707},{-0.966,0.259},
                                             {-0.966,-0.259},{-0.707,-0.707},{-0.259,-0.966},
                                             {0.259,-0.966},{0.707,-0.707},{0.966,-0.259}                                             
                                           };
   public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(1, 1, (int)flagW, (int)flagH);
      g.setColor(new Color(0, 0, 150));
      g.fillRect(1, 1, (int)flagW/2, (int)flagH/2);
      g.setColor(Color.WHITE);
      for(int i = 0; i < 12; i++){
         int xPoints[] = { (int)(flagW/4+1+flagW/8*outerCircle[i][0]),
                           (int)(flagW/4+1+flagH*3/32*innerCircle[i][0]),
                           (int)(flagW/4+1+flagH*3/32*innerCircle[i+1][0])
                         };
         int yPoints[] = { (int)(flagH/4+1-flagW/8*outerCircle[i][1]),
                           (int)(flagH/4+1-flagH*3/32*innerCircle[i][1]),
                           (int)(flagH/4+1-flagH*3/32*innerCircle[i+1][1])
                         };
         g.fillPolygon(xPoints, yPoints, 3);
      }
      g.setColor(new Color(0, 0, 150));
      g.fillOval((int)(flagW/4+1-flagH*17/160), (int)(flagH/4+1-flagH*17/160), (int)(flagH*17/80) , (int)(flagH*17/80));
      g.setColor(Color.WHITE);
      g.fillOval((int)(flagW/4+1-flagH*3/32), (int)(flagH/4+1-flagH*3/32), (int)(flagH*3/16) , (int)(flagH*3/16));
   }
}
