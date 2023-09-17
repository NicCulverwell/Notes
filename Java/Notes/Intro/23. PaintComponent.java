package NOTES;

import javax.swing.*;
import java.awt.*;

class PaintComponent {

    public static void main(String [] args) {


        JFrame frame = new JFrame("Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        Paint p = new Paint(); // Calling the class Paint (Compiled Below)
        frame.add(p);
        frame.setVisible(true);

    }

}

class Paint extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // calls the superclass methods for the paintComponent Imported Class, as well as associate it with the object g
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 30, 50); // Take 4 Parameters: x,y,length,height - NOTE that the top left point is 0,0 according to the coordinates: x,y

        g.setColor(new Color(190,40,29)); // Colours can also be set according to their rgb values (maximum of 255 on each parameter)
        g.fillRect(85, 25, 30, 50); // fillRect is used to make a Rectangle

        g.setColor(Color.RED);
        g.drawString("FRANCE", 25, 120);

    }

    /* paintComponent()
    
     - Called when the component is first drawn, and when the size changes
     - Called by the system, not called directly
     - Repaint(), defined in the component class, informs the system, that it needs to be redrawn
     - repaint() returns immediately and the call to paintComponent() happens later
     - use instance variables to change what you want to display

    */ 






}
