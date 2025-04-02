import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrder extends JFrame {
    private JLabel marg;
    private JTextField margCust;
    private JLabel quattroF;
    private JTextField QFCust;
    private JLabel quattroS;
    private JTextField QSCust;
    private JLabel funggi;
    private JTextField funggiCust;
    private JLabel Total;
    private JTextField TotalCust;
    private JButton Order;

    public PizzaOrder() {
        this.setTitle("Order Pizza");
        this.setSize(400, 400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 5, 10)); // 4 rows, 2 columns, with gaps

        marg = new JLabel("'Margherita' (5.5 euro)");
        margCust = new JTextField();
        margCust.setPreferredSize(new Dimension(50, 10));

        quattroF = new JLabel("'Quattro Formaggi' (4.5 euro)");
        QFCust = new JTextField();
        QFCust.setPreferredSize(new Dimension(50, 10));

        quattroS = new JLabel("'Quattro Staggioni' (5.8 euro)");
        QSCust = new JTextField();
        QSCust.setPreferredSize(new Dimension(50, 10));

        funggi = new JLabel("'Fungghi Porcini' (6.0 euro)");
        funggiCust = new JTextField();
        funggiCust.setPreferredSize(new Dimension(50, 10));

        Total=new JLabel("Total");
        TotalCust=new JTextField();
        TotalCust.setPreferredSize(new Dimension(50,10));

        Order=new JButton("Order");
        Order.addActionListener(new OrderCount());

        mainPanel.add(marg);
        mainPanel.add(margCust);
        mainPanel.add(quattroF);
        mainPanel.add(QFCust);
        mainPanel.add(quattroS);
        mainPanel.add(QSCust);
        mainPanel.add(funggi);
        mainPanel.add(funggiCust);
        mainPanel.add(Total);
        mainPanel.add(TotalCust);
        mainPanel.add(Order);

        this.add(mainPanel);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class OrderCount implements ActionListener{
        float margI;
        float QFI;
        float QSI;
        float funggiI;
        public void actionPerformed(ActionEvent e){
            try {
                if (margCust.getText().isEmpty())
                    margI = 0;
                else margI = Integer.parseInt(margCust.getText());
                if (QFCust.getText().isEmpty())
                    QFI = 0;
                else QFI = Integer.parseInt(QFCust.getText());
                if (QSCust.getText().isEmpty())
                    QSI = 0;
                else QSI = Integer.parseInt(QSCust.getText());
                if (funggiCust.getText().isEmpty())
                    funggiI = 0;
                else funggiI = Integer.parseInt(funggiCust.getText());
                float sum = (float) (margI * 5.5 + QFI * 4.5 + QSI * 5.8 + funggiI * 6.0);
                TotalCust.setText(String.valueOf(sum));
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(PizzaOrder.this, "Invalid input! Please enter valid numbers.");
                return;
            }
        }
    }
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();
        order.setVisible(true);
    }
}