import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Taller_18 taller_18 = new Taller_18();
        String salida = "";
        char seguir;
        do {
            salida += taller_18.leer();
            JOptionPane.showMessageDialog(null,
            "S A L I D A\n" + salida);
        seguir = JOptionPane.showInputDialog("Para intentar de nuevo ingrese S o s").charAt(0);
        } while (seguir == 'S' || seguir == 's');
    }
}

