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
        int u = n - 1;
        while (t < n) {
            t = 0;
            for (int x = u; x < n; x++) {
                vec[t][x] = h;
                h++;
                t++;
            }
            u--;
        }
        u = n - 1;
        int r = 1;
        while (r <= n - 1) {
            t = r;
            for (int x = 0; x < u; x++) {
                vec[t][x] = h;
                h++;
                t++;
            }
            u--;
            r++;
        }

        salida += "\n Matriz Original\n";
        Procesar Main = new Procesar();
        Main.procesar(vec, salida, n);
    }
}