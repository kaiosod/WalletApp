package wallet;

import java.awt.event.ActionEvent;

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


    }
}
