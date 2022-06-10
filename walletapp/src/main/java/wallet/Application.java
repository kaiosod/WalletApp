package wallet;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Assets x1 = new Assets();
            x1.setVisible(true);
        });
    }

}
