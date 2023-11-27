package SwingTest;

import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;


public class LetsSwing{

    public static void main(String args[]){
        JFrame frame = new JFrame();
        JTextField textField = new JTextField("Hallo");
        System.out.println(textField.getText());
        frame.setVisible(true);
    }
}
