import javax.swing.JOptionPane;

public class Leer {
    public void leer() {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (mayor igual a 3): "));
        } while (n < 3);

        int vec[][] = new int[n][n];
        String salida = "Dimension de la matriz: " + n;
        int t = 0;
        int h = 1;
        for (int x = 0; x < n; x++) {
            for (int j = n - 1; j > -1; j--) {
                vec[x][j] = 0;
            }
        }
        for (int x = n - 1; x > 0; x--) {
            for (int j = t; j < n - t; j++) {
                vec[j][x] = h;
                h++;
            }
            for (int j = (n - 2) - t; j >= t; j--) {
                vec[x][j] = h;
                h++;
            }
            for (int j = x - 1; j >= t; j--) {
                vec[j][t] = h;
                h++;
            }
            for (int j = t + 1; j <= x - 1; j++) {
                vec[t][j] = h;
                h++;
            }
            t++;
        }
        salida += "\n Matriz Original\n";
        Procesar Main = new Procesar();
        Main.procesar(vec, salida, n);
    }
}