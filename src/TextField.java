import javax.swing.*;
import java.awt.*;

public class TextField extends JFrame {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel mileageNow = new JLabel("Ange mätarställning nu: ");
    JLabel mileageThen = new JLabel("Annge mätarställning för ett år sedan: ");
    JLabel usedGasoline = new JLabel("Ange antal liter förbrukad bensin: ");
    JLabel countedMileage = new JLabel(" ");
    JLabel gasoline = new JLabel(" ");
    JLabel usagePerMil = new JLabel(" ");
    JTextField milNow = new JTextField();
    JTextField milThen = new JTextField();
    JTextField usedGas = new JTextField();

    TextField(){
        p1.setLayout(new GridLayout(3,2));
        p1.add(mileageNow); p1.add(milNow);
        p1.add(mileageThen); p1.add(milThen);
        p1.add(usedGasoline); p1.add(usedGas);
        p2.setLayout(new FlowLayout());
        p2.add(countedMileage); p2.add(gasoline); p2.add(usagePerMil);
        pack();
    }
}
