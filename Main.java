import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("United");

        JLabel label = new JLabel("not clicked yet");
        JButton button = new JButton("click");
        button.addActionListener(e -> { label.setText("clicked"); });

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
