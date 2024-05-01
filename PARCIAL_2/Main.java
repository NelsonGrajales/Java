
// programa que lea n cantidad de numeros , sumar los 3 numeros del centro
// e imprimir la suma 
//salida: la suma de los 3 numeros del centro es : 
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Parcial_2 parcial_2 = new Parcial_2();
        int repetir;
        do {
            parcial_2.leer();
            repetir = JOptionPane.showConfirmDialog(null, "Intentar de nuevo?");
        } while (repetir == JOptionPane.YES_OPTION);
    }
}
