import java.awt.Container;
import javax.swing.JFrame;


public class BBallGUI extends JFrame{
   
    public BBallGUI(){
        setSize(300,300);
        setResizable(false);
        setTitle("My BBall Stats Program");

        Container pane = getContentPane();
        pane.add(new BBallPanel());

    }

    public static void main(String[] args) {
        BBallGUI frame = new BBallGUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}