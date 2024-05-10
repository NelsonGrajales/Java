import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Taller_17 taller_17 = new Taller_17();
        char seguir;
        do {
            taller_17.leer();
            seguir = JOptionPane.showInputDialog("Para intentar de nuevo ingrese S o s").charAt(0);
        } while (seguir == 'S' || seguir == 's');
    }
}