import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {


    public Window(){
        super("Title");

        JPanel panel = new JPanel(new BorderLayout());

        JButton topButton = new JButton(VehiclesEnum.BOAT.madeFor);

        JLabel midLabel = new JLabel("I am in the middle",SwingConstants.CENTER);

        JToggleButton toggleButton = new JToggleButton("bottomToggle");

        panel.add(topButton,BorderLayout.NORTH);
        panel.add(midLabel,BorderLayout.CENTER);
        panel.add(toggleButton,BorderLayout.SOUTH);
        this.add(panel);

        this.setVisible(true);
        this.setSize(800,400);





    }


}
