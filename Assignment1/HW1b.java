import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class HW1b extends JFrame implements ItemListener
{
    int x, y, width, height;
    Random rand = new Random();
    Container container;
    JComboBox shapeSelection;
    String[] shapes = { "Circle", "Square", "Oval", "Rectangle" };
    int currentShape;
    final int CIRCLE = 0;
    final int SQUARE = 1;
    final int OVAL = 2;
    final int RECTANGLE = 3;

    public HW1b()
    {
        super( "GUI App" );

        container = getContentPane();

        container.setLayout( new BorderLayout() );
        shapeSelection = new JComboBox( shapes );
        shapeSelection.addItemListener(this);

        container.add( shapeSelection, BorderLayout.PAGE_END );

        setSize(650, 650);
        setLocation( 200, 200 );
        setVisible( true );

    }

    public void itemStateChanged( ItemEvent ie )
    {
        currentShape = shapeSelection.getSelectedIndex();
        super.repaint();
    }


    public void paint( Graphics g )
    {
        int min = 50;
        int max = 350;
        int widthMin = 15;
        int widthMax = 270;
        int heightMin = 15;
        int heightMax = 270;
        int numOfTimes = 20;

        super.paint( g );

        if ( currentShape == CIRCLE )
        {
            for( int i = 0; i < numOfTimes; i++ )
            {
                x = min + rand.nextInt( max - min );
                y = min + rand.nextInt( max - min );
                width = widthMin + rand.nextInt( widthMax - widthMin );
                height = width;

                g.drawOval( x, y, width, height);
            }
        }
        else if ( currentShape == SQUARE )
        {
            for( int i = 0; i < numOfTimes; i++ )
            {
                x = min + rand.nextInt( max - min );
                y = min + rand.nextInt( max - min );
                width = widthMin + rand.nextInt( widthMax - widthMin );
                height = width;

                g.drawRect(x, y, width, height);
            }
        }
        else if ( currentShape == OVAL )
        {
            for( int i = 0; i < numOfTimes; i++ )
            {
                x = min + rand.nextInt( max - min );
                y = min + rand.nextInt( max - min );
                width = widthMin + rand.nextInt( widthMax - widthMin );
                height = heightMin + rand.nextInt( heightMax - heightMin );

                g.drawOval( x, y, width, height);
            }
        }
        else if ( currentShape == RECTANGLE )
        {
            for( int i = 0; i < numOfTimes; i++ )
            {
                x = min + rand.nextInt( max - min );
                y = min + rand.nextInt( max - min );
                width = widthMin + rand.nextInt( widthMax - widthMin );
                height = heightMin + rand.nextInt( heightMax - heightMin );

                g.drawRect( x, y, width, height);
            }
        }
    }


    public static void main(String[] args)
    {
        HW1b demo = new HW1b();
        demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    }
}
