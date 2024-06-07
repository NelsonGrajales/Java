import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Leer Main = new Leer();
        int respuesta;
        do {
            Main.leer();
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
                    JOptionPane.YES_NO_OPTION);
        } while (respuesta == JOptionPane.YES_OPTION);
    }
}