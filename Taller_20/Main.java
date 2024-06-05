import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Leer Main = new Leer();
        char seguir;
        do {
            Main.leer();
            seguir = JOptionPane.showInputDialog("Para intentar de nuevo ingrese S o s").charAt(0);
        } while (seguir == 'S' || seguir == 's');
    }
}