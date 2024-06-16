import javax.swing.JOptionPane;

public class Leer {
    public void leer() {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (mayor igual a 3): "));
        } while (n < 3);

        int vec[][] = new int[n][n];
        String salida = "Dimension de la matriz: " + n;

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                vec[x][j] = 0;
            }
        }

        salida += "\n Matriz Original\n";
        Procesar Main = new Procesar();
        Main.procesar(vec, salida, n);
    }
}