
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del que desea ver la tabla"));
        Taller_13 taller = new Taller_13();
        taller.procesar(num);
    }
}
