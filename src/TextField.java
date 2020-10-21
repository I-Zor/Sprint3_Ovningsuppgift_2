import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {

    JLabel mileageNow = new JLabel("Ange mätarställning nu: ");
    JLabel mileageThen = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel usedGasoline = new JLabel("Ange antal liter förbrukad bensin: ");
    JLabel countedMileage = new JLabel(" ");
    JLabel gasoline = new JLabel(" ");
    JLabel usagePerMil = new JLabel(" ");
    JTextField milNow = new JTextField();
    JTextField milThen = new JTextField();
    JTextField usedGas = new JTextField();

    JPanel questions = new JPanel();
    JPanel answers = new JPanel();
    JPanel resultat = new JPanel();


    TextField(){
        setLayout(new BorderLayout());
        add(BorderLayout.WEST, questions);
        add(BorderLayout.EAST, answers);
        add(BorderLayout.SOUTH, resultat);

        questions.setLayout(new GridLayout(3,1));
        questions.add(mileageNow); questions.add(mileageThen); questions.add(usedGasoline);
        answers.setLayout(new GridLayout(3,1));
        answers.add(milNow); answers.add(milThen); answers.add(usedGas);
        resultat.setLayout(new FlowLayout());
        resultat.add(countedMileage); resultat.add(gasoline); resultat.add(usagePerMil);

        milNow.addActionListener(this);
        milThen.addActionListener(this);
        usedGas.addActionListener(this);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
