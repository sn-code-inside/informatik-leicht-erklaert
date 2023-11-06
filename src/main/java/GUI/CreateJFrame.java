package GUI;

import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


public class CreateJFrame{

    public static void main(String[] args){
        JFrame frame = new JFrame("EventHandling-Frame");

        JPanel panel = new JPanel();

        JButton button = new JButton("Hallo!");


        Action myAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Klappt!");
            }
        };

        panel.getInputMap().put(KeyStroke.getKeyStroke((char) KeyEvent.VK_ESCAPE), "qEvent");
        panel.getActionMap().put("qEvent", myAction);


        panel.add(button);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}