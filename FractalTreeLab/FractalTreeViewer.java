//********************************************************************
//  KochSnowflakeViewer.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of recursion.
//  @gcschmit (19 July 2014): converted from an applet to an application
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTreeViewer implements ActionListener
{
    private final int WIDTH = 700;
    private final int HEIGHT = 700;

    private JLabel titleLabel;
    private FractalTree drawing;
    private JPanel panel;
    private JFrame frame;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

    public FractalTreeViewer()
    {
        titleLabel = new JLabel ("Fractal Tree");
        titleLabel.setForeground (Color.black);

        drawing = new FractalTree (1);

        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(drawing);
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
