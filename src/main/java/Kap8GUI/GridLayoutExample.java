package Kap8GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("GridLayout-Frame");

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3,2));

        //place buttons and empty fields
        panel.add(new JButton("1"));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JLabel(""));

        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
