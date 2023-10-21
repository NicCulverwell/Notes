package Computation;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class MouseEvents {
    
    public static void main(String[] args) {

        new MyFrame();


    }

    static class MyFrame extends JFrame implements MouseListener {

        JLabel label;

        MyFrame() {

            int x = 500;
            int y = 500;

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(x,y);
            this.setLocationRelativeTo(null);
            this.setLayout(null);

            label = new JLabel();
            label.setBounds(x/2-50,y/2-50, 100,100);
            label.setBackground(Color.blue);
            label.setOpaque(true);
            label.addMouseListener(this); // Because the MouseListener was only added to the label, the mouse presses will only work on the label itself
            

            this.add(label);
            this.setVisible(true);
        }

        // In the Event that you do not wish to use all of the below mouse events, you can implement Mouse Adapter instead of MouseListener, which will allow you to choose from what you wish to implement

        @Override
        public void mouseClicked(MouseEvent e) { // Called when a mouse button is pressed and released
            System.out.println("You Clicked the Mouse");
        }

        @Override
        public void mousePressed(MouseEvent e) { // Called when the mouse button is pressed
            System.out.println("You Pressed the Mouse");
            label.setBackground(Color.red); // Sets the Label to a new Random Coloor everytime it is pressed
        }

        @Override
        public void mouseReleased(MouseEvent e) { // Called when the mouse button is released
            System.out.println("You Released the Mouse");
            label.setBackground(Color.green);
        }

        @Override
        public void mouseEntered(MouseEvent e) { // Called when the Mouse moves into the area of a component
            System.out.println("You Entered the Application");
            label.setBackground(Color.blue);
        }

        @Override
        public void mouseExited(MouseEvent e) { // Called when the Mouse moves out of the area of a component
            System.out.println("You Exited the Application");
        }

        

    }

}
