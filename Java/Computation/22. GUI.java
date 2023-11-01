package Computation;

import javax.swing.*;
import java.awt.event.*;

class GUI {

    public static void main(String [] args) {


        // An interface is a device or a system that unrelated entities use to interact
        // A Graphical User Interface is an interface that allows users to interact with your code

        // Event-Driven Programming:
        // The flow of the program is determined by events like mouse clicks or keys being pressed
        // GUI Programs react to user-events, instead of controlling what the user can do

        JOptionPane.showMessageDialog(null, "Humbly Present:", "I Your Host", JOptionPane.PLAIN_MESSAGE); // This will print a Default Notification


        JFrame frame = new JFrame("Error 404: No Bitches Found");  // The Frame refers to the Outer Border of the Application, Thus you can determine its dimensions, and the Title on that border
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This determines how the applications stops running (In this case, when the JFrame that pops up is exited)
        frame.setSize(500,500); // Sets Dimensions of the Frame
        frame.setLocationRelativeTo(null); // sets the Frame in the Centre of the Screen
        JPanel panel = new JPanel(); // The Panel refers to the content within the Frame
        frame.add(panel); // And Must as a result be added to the frame, so there is a point of reference

        JButton button = new JButton("No Bitches?"); // Creating an Interactable Object
        button.addActionListener(new ActionListener(){  // Action Listeners are classes that receive a notification when an action is performed on the object, in this case button
            public void actionPerformed(ActionEvent e) { // When e is activated (as this is a button, when the button is pressed) an action will be performed
                JOptionPane.showMessageDialog(panel, "Error 404: Sorry, we couldn't find any Bitches"); // This is the action performed
            }
        });

        panel.add(button); // Adding the button to the panel
        frame.setVisible(true); // Makes the JFrame Visible 



        /* JOptionPane:

            showMessageDialog() - Displays a Message
            showConfirmDialog() - Enables the user to answer a Question
            showInputDialog()   - Allows entry of a text
            showOptionDialog()  - Enables the user to select from multiple options

         */

        /* Imports:
        
            import javax.swing.*;
            import java.awt.*;
            import java.awt.event.*;

         */

        /* Layout Manager
          
            Used to position the components on the GUI
            The FLowLayout is the default layout (lays out components in a directional flow) 


         */






    }
}