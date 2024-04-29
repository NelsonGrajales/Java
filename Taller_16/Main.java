
//Cargar vector de n elementos y ordenar el vector de menor a mayor.
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Taller_16 taller = new Taller_16();
        String salida = "";
        int repetir;
        do {
            salida = taller.leer();
            JOptionPane.showMessageDialog(null, "S A L I D A \n" + salida);
            repetir = JOptionPane.showConfirmDialog(null, "Intentar de nuevo?");
        } while (repetir == JOptionPane.YES_OPTION);
    }

}