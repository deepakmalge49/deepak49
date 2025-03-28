package electricity.billing.system;

import java.awt.Desktop;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener {

    String meter;
    JButton back;

    Paytm(String meter) {
        this.meter = meter;

        try {
            Desktop.getDesktop().browse(new URI("https://paytm.com/online-payments"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBounds(100, 100, 80, 30);
        back.addActionListener(this);
        add(back);

        setSize(300, 200);
        setLayout(null);
        setLocation(400, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PayBill(meter);
    }

    public static void main(String[] args) {
        new Paytm("");
    }
}
