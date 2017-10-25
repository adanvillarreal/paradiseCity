import Interfaz.interfazPrincipal;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new interfazPrincipal();
                // everything else here
            }
        });
    }
}
