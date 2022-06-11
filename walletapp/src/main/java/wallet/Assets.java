package wallet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Assets extends Wallet {


    @Override
    protected void btnCloseClick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();

    }

    @Override
    protected void btnCleanClick(ActionEvent ev) {
        txtName.setText("");
        txtAmount.setText("");
        txtPrice.setText("");
        txtInitials.setText("");
        txtTotalValue.setText("");

    }

    @Override
    protected void btnAddClick(ActionEvent ev) {

        String name = txtName.getText();
        String amount = txtAmount.getText();
        String initials = txtInitials.getText();
        String price = txtPrice.getText();

        Float f_price = Float.valueOf(price);
        Integer i_amount = Integer.valueOf(amount);

        Float f_total = f_price * i_amount;

        System.out.println("Connection: Done");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet","root","kaio123k7");

            PreparedStatement stmt = connect.prepareStatement("INSERT INTO assets (Nome, Amount, Initials, Price, Total) VALUES (?,?,?,?,?)");

            stmt.setString(1,name);
            stmt.setString(2,amount);
            stmt.setString(3,initials);
            stmt.setString(4,price);
            stmt.setFloat(5,f_total);

            stmt.executeUpdate();


        } catch (ClassNotFoundException e) {
            System.out.println("Drive Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }

    }
}
