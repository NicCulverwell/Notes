package Computation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Required for KeyListener

class KeyEvents {
    
    public static void main(String [] args) {

        new MyFrame();

    }

    static class MyFrame extends JFrame implements KeyListener { // for some reason making this static works

        JLabel label;


        MyFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);
            this.setLayout(null);
            this.addKeyListener(this);

            label = new JLabel();
            label.setBounds(10, 10, 100, 100); // Sets its starting coordinates (0,0) and then its size (100,100)
            label.setBackground(Color.BLUE);
            label.setOpaque(true); // makes the label visible


            this.add(label);
            this.setVisible(true);
        }

 
        public void keyTyped(KeyEvent e) {  // Called when a button being pressed and released (Holding the button results in multiple instances)

            switch(e.getKeyChar()) {
                case 'a': label.setLocation(label.getX()-10, label.getY()); //setLocation allows you to move the item to a specific location on the screen (x,y coordinates)
                    break;
                case 'w': label.setLocation(label.getX(), label.getY()-10);
                    break;
                case 'd': label.setLocation(label.getX()+10, label.getY());
                    break;
                case 's': label.setLocation(label.getX(), label.getY()+10);
                    break;
                default: label.setLocation(label.getX(), label.getY());
                    break;
            }

        }

        public void keyPressed(KeyEvent e) { // Called When a key being pressed down (Holding the button results in multiple instances)
            switch(e.getKeyCode()) {
                case 37: label.setLocation(label.getX()-10, label.getY());
                    break;
                case 38: label.setLocation(label.getX(), label.getY()-10);
                    break;
                case 39: label.setLocation(label.getX()+10, label.getY());
                    break;
                case 40: label.setLocation(label.getX(), label.getY()+10);
                    break;
                default: label.setLocation(label.getX(), label.getY());
                break;
            }
        }

        public void keyReleased(KeyEvent e) { // Called when a key, that is already pressed down, is let go
            System.out.println("You released the button: " + e.getKeyChar());
            System.out.println("You released the button: " + e.getKeyCode()); // Useful if specific keys need to be found (ie. shift or tab)
        }

    }


}
