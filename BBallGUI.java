import java.awt.Color;

import javax.swing.JFrame;

import jdk.internal.platform.Container;

public class BBallGUI extends JFrame{
   
    public BBallGUI(){
        setSize(300,300);
        setBackground(Color.cyan);
        setResizable(false);

        BorderLayout layout = new BorderLayout();
        Container pane = getContentPane();
        pane.setLayout();

        pane.add(new BBallPanel());
    }

    public static void main(String[] args) {
       BBallGUI frame = new BBallGUI();
        frame.setVisible(true);
    }
}