package GUI;
import java.awt.*;
import javax.swing.*;

class Flow {
    
    public static void main(String [] args) {

        // Layout Manager: Defines the Natural Layout for components within a container

        // FlowLayout: Places Components in a row, sized at their preferred sizew
        //             If the horizontal space in the container is to small
        //             The FlowLayout uses the next avilable row

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING)); // FlowLayout makes a layout inwhich new items are automatically added next to the previous item
        // LEADING will make the 'flow' start on the left hand side
        // CENTRE will make the layout central on the line 
        // TRAILING will make the layout end on the right-hand side

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,120)); // Preferred Size, means that the size will stay set, when the frame is changed
        panel.setBackground(Color.lightGray);

        frame.add(panel);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Numbers represent the gap between each item in the flow, horizontally and then vertically

        panel.add(new JButton("1")); // Shortcut for making new buttons
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));




        frame.setVisible(true);
    }

}
