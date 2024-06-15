import javax.swing.JOptionPane;

public class Leer {
    public void leer() {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz (mayor igual a 3): "));
        } while (n < 3);

        int vec[][] = new int[n][n];
        String salida = "Dimension de la matriz: " + n;
        int h = 1;
        for (int x = 0; x < n; x++) {
            for (int j = n - 1; j > -1; j--) {
                vec[x][j] = 0;
            }
        }
        for (int x = n - 1; x > -1; x--) {
            for (int j = 0; j <= n - 1; j++) {
                if (h % 2 == 0)
                    h++;
                vec[j][x] = h;
            }
            h++;

        }
        salida += "\n Matriz Original\n";
        Procesar Main = new Procesar();
        Main.procesar(vec, salida, n);
    }
}