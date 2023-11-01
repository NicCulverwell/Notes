package Computation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Buttons {
    
    public static void main(String [] args) {

        new MyFrame();
    }

    static class MyFrame extends JFrame implements ActionListener { // dont forget implements ActionListener

        JButton button; // Defining the button globally, so that it can be used outside of the constructor

        MyFrame() {

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500); // Sets Size of Application
            this.setLocationRelativeTo(null); // Puts the Application on the Centre of the Screen
            this.setLayout(null); // Defaults the Layout style to nothing (Defaulted to a FlowLayout Format)

            button = new JButton(); // Defining the Button within the constructor
            
            button.addActionListener(this); // Allows the Button to be registered to do something
            button.setSize(200,100); // Setting the Size of the Button
            button.setLocation(500/2 - 110, 500/2 - 80); // Setting the position of the Button
            // button.setBounds(x,y,width,height) essentially is the same as the previous two lines combined

            button.setBackground(Color.pink);
            button.setText("PUSH ME"); // Determining the Label on the Button
            button.setFocusable(false); // Removes annoying border around the text
            

            this.add(button); // Adds the Button to the Application
            this.setVisible(true); // Makes the Application Visible
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) {
                System.out.println("YOU PUSHED THE BUTTON");
            }
        }


    }

}


