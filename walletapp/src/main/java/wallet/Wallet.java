package wallet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class Wallet extends JFrame {

    protected JPanel pnlForm;
    protected JPanel pnlFooter;

    protected JButton btnAdd;
    protected JButton btnClean;
    protected JButton btnClose;

    // name
    protected JLabel lblName;
    protected JTextField txtName;

    // price
    protected JLabel lblPrice;
    protected JTextField txtPrice;

    // initials
    protected JLabel lblInitials;
    protected JTextField txtInitials;

    // amount
    protected JLabel lblAmount;
    protected JTextField txtAmount;

    // totalValue
    protected JLabel lblTotalValue;
    protected JTextField txtTotalValue;

    public Wallet() {
        this.start();
        this.events();
    }

    protected void start() {
        this.setTitle("Wallet");
        //this.setSize(640,480);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.getContentPane().setLayout(new BorderLayout()); // search

        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlFooter(), BorderLayout.PAGE_END);


        this.pack();
    }

    protected abstract void btnCloseClick(ActionEvent ev);

    protected abstract void btnCleanClick(ActionEvent ev);

    protected abstract void btnAddClick(ActionEvent ev);

    private void events() {
        btnClose.addActionListener(this::btnCloseClick);
        btnClean.addActionListener(this::btnCleanClick);
        btnAdd.addActionListener(this::btnAddClick);

    }

    public JPanel getPnlForm() {
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(5, 2));

            lblName = new JLabel("Name");
            txtName = new JTextField(25);

            lblInitials = new JLabel("Initials");
            txtInitials = new JTextField(20);

            lblPrice = new JLabel("Price");
            txtPrice = new JTextField(20); // mudar

            lblAmount = new JLabel("Amount");
            txtAmount = new JTextField(20); // mudar

            lblTotalValue = new JLabel("Total");
            txtTotalValue = new JTextField(20); //mudar
            txtTotalValue.setEditable(false);

            pnlForm.add(lblName);
            pnlForm.add(txtName);

            pnlForm.add(lblInitials);
            pnlForm.add(txtInitials);

            pnlForm.add(lblPrice);
            pnlForm.add(txtPrice);

            pnlForm.add(lblAmount);
            pnlForm.add(txtAmount);

            pnlForm.add(lblTotalValue);
            pnlForm.add(txtTotalValue);

        }
        return pnlForm;
    }

    public JPanel getPnlFooter() {
        if (pnlFooter == null) {
            pnlFooter = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnAdd = new JButton("Add");
            btnClean = new JButton("Clear");
            btnClose = new JButton("Close");

            pnlFooter.add(btnAdd);
            pnlFooter.add(btnClean);
            pnlFooter.add(btnClose);
        }
        return pnlFooter;
    }

}
