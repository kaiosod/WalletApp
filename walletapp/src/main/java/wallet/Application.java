package wallet;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args)  {


        SwingUtilities.invokeLater(() -> {
            Assets x1 = new Assets();
            x1.setVisible(true);
        });
    }

}
