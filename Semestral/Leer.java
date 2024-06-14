import javax.swing.JOptionPane;

public class Leer {
    public void leer() {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (mayor igual a 3): "));
        } while (n < 3);

        int matriz[][] = new int[n][n];
        String salida = "Dimension de la matriz: " + n;
        salida += "\n Matriz caracol\n";
        Procesar Main = new Procesar();
        Main.procesar(matriz, salida, n);
    }
}