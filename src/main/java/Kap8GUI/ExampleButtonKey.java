package Kap8GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class ExampleButtonKey {
    public static void main(String[] args){
        JFrame frame = new JFrame("Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");
        JDialog dialog = new JDialog();
        JLabel label = new JLabel("You clicked the button.");
        JPanel dialogPanel = new JPanel();

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();

        dialogPanel.add(label);
        dialog.add(dialogPanel);

        button.addActionListener(new ActionListener() {
            @Override
            public void
            actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });

        Action closeAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        };

        panel.getInputMap().put(KeyStroke.getKeyStroke((char) KeyEvent.VK_ESCAPE), "EscapeEvent");
        panel.getActionMap().put("EscapeEvent", closeAction);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
