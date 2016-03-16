import java.awt.*;
import javax.swing.JPanel;

public class FractalTree extends JPanel
{
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private int current; //current order
   
   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;
   
   private final double scalingFactor = .6;
   private double branchAngle = Math.toRadians(30); 
   private final int minBranchLength = 5;
   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public FractalTree (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (Graphics2D g2, double x, double y, double length, double angle)
   {
      int deltaX, deltaY, x2, y2;
      
      if (this.current == 1)
         g2.drawLine (200, 325, (int)x, (int)y);
      else
      {
         deltaX = (int) (length*Math.sin(this.branchAngle));  // distance between end points
         deltaY = (int) (length*Math.cos(this.branchAngle));
         
         x2 = (int)x-deltaX;
         y2 = (int)y+deltaY;

         drawFractal(g2,x2,y2,length*this.scalingFactor,this.branchAngle+Math.toRadians(30));
         drawFractal(g2,x2,y2,length*this.scalingFactor,this.branchAngle-Math.toRadians(30));
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      page.setColor (Color.green);

      drawFractal (this.current, TOPX, TOPY, LEFTX, LEFTY, page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}

