import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * View the fractal tree
 * 
 * @Adrianna
 * @3/18/16
 */

public class FractalTreeViewer implements ActionListener
{
    /** width of frame */
    private final int WIDTH = 700;
    /** height of frame */
    private final int HEIGHT = 700;

    private FractalTree drawing;
    private JPanel panel;
    private JFrame frame;

    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

    public FractalTreeViewer()
    {
        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(new FractalTree());
        frame.setVisible(true);
    }

    //-----------------------------------------------------------------
    //  Determines which button was pushed, and sets the new order
    //  if it is in range.
    //-----------------------------------------------------------------
    public void actionPerformed (ActionEvent event)
    {
        frame.repaint();
    }
}
