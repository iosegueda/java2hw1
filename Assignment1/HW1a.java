import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class HW1a extends JFrame
{
    Random rand = new Random();
    int red, green, blue;
    int[ ] xPoints = new int[3];
    int[ ] yPoints = new int[3];
    public HW1a()
    {
        super( "Homework 1" );
        setSize( 500, 500 );
        setLocation( 200, 200 );
        setVisible( true );
    }
    public void paint( Graphics g )
    {
        super.paint(g);
        Graphics2D g2d;
        GeneralPath triangle;

        for( int i = 0; i < 10; i++ )
        {
            red = rand.nextInt( 256 );
            green = rand.nextInt( 256 );
            blue = rand.nextInt( 256 );

            for ( int j = 0; j < 3; j++)
            {
                xPoints[j] = 40 + rand.nextInt( 401 );

                yPoints[j] = 40 + rand.nextInt( 401 );
            }

            g2d = (Graphics2D)g;

            triangle = new GeneralPath();

            triangle.moveTo( xPoints[ 0 ], yPoints[ 0 ] );

            for (int k = 1; k < xPoints.length; k++)
            {
                triangle.lineTo(xPoints[k], yPoints[k]);
            }

            triangle.closePath();

            g.setColor( new Color( red, green, blue ) );

            g2d.draw( triangle );

            g2d.fill( triangle );
        }
    }
    public static void main(String[] args)
    {
        HW1a demo = new HW1a();
        demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}
