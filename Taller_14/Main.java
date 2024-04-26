
// Programa que carga un vector de n elementos e imprima la suma de los
// elementos pares e impares
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión del vector"));
            Taller_14 taller = new Taller_14();
            JOptionPane.showInputDialog(null, taller.leer(n));

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?", "Confirmación",
                    JOptionPane.YES_NO_OPTION);
            continuar = (opcion == JOptionPane.YES_OPTION);
        }
    }
}
