package Intro;

import javax.swing.*;


class Events {

    public static void main(String [] args) {

        /*Types of Events:
        
        Action Event: 
            a general event that is triggered when a component-dependent action occurs.
            eg. a button press or menu item selection

        Mouse Event:
            Relates to User Interaction with the Mouse

        Key Event:
            Reltaes to Key Presses on a Keyboard

        Timer Event:
            Trigger Events at Regular Intervals
            requires the javax.swing.Timer import
        
        */
        new MyFrame(); // Calling the JFrame



    }

    static class MyFrame extends JFrame {

        MyFrame() {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);
            this.setLocationRelativeTo(null);
            JPanel panel = new JPanel();
            this.add(panel);
            this.setVisible(true);
        }

    }

}
