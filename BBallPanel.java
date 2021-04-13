import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BBallPanel extends JPanel {

private ArrayList<Player> players = new ArrayList<Player>();

    public BBallPanel(){
        JLabel fNameLBL = new JLabel("First Name");
        JLabel lNameLBL = new JLabel("Last Name");
        JLabel shootPctLBL = new JLabel("Shooting %");
        JLabel reboundsLBL = new JLabel("Rebounds");
        JLabel assistsLBL = new JLabel("Assists");
        JLabel turnoversLBL = new JLabel("Turnovers");
        JLabel currentLBL = new JLabel("0 of 0");


        add(fNameLBL);
        add(lNameLBL);
        add(shootPctLBL);
        add(reboundsLBL);
        add(assistsLBL);
        add(turnoversLBL);
        add(currentLBL);

    }
    private void newRecord(){

    }

    private void saveRecord(){
        
    }
    private void firstRecord(){

    }
    private void lastRecord(){

    }
    private void nextRecord(){

    }
    private void previousRecord(){

    }
}
