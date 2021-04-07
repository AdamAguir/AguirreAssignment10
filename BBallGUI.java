import java.awt.Color;

import javax.swing.JFrame;

public class BBallGUI extends JFrame{
   
    public BBallGUI(){
        setSize(300,300);
        setBackground(Color.cyan);
    }

    public static void main(String[] args) {
       BBallGUI frame = new BBallGUI();
        frame.setVisible(true);
    }
}