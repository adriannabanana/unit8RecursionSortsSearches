import java.awt.*;
import javax.swing.JPanel;

public class FractalTree extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    //private int current; //current order

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private final double scalingFactor = .60;
    private double branchAngle = Math.toRadians(60); 
    private final int minBranchLength = 1;
    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public FractalTree (int currentOrder)
    {
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively.
    //-----------------------------------------------------------------
    public void drawFractal (Graphics2D g2, double x, double y, double length, double angle)
    {
        int endX1,endY1,endX2,endY2;
        double angle1 = angle+this.branchAngle;
        double angle2 = angle-this.branchAngle;
        length*=scalingFactor;

        endX1 = (int) (x-length*Math.sin(angle1));  
        endY1 = (int) (y-length*Math.cos(angle1));

        endX2 = (int) (x-length*Math.sin(angle2));  
        endY2 = (int) (y-length*Math.cos(angle2));

        if (length > this.minBranchLength)
        {
            g2.drawLine((int)x,(int)y,endX1,endY1);
            g2.drawLine((int)x,(int)y,endX2,endY2);
            drawFractal(g2,endX1,endY1,length,angle1);
            drawFractal(g2,endX2,endY2,length,angle2);
        }


    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        Graphics2D g2 = (Graphics2D) page;
        super.paintComponent(page);

        page.setColor (Color.CYAN);

        g2.drawLine(350,600,350,150);
        drawFractal (g2,350,420,200,0);
        drawFractal(g2,350,150,100,0);
    }

}
