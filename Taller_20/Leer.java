import javax.swing.JOptionPane;

public class Leer {
    public void leer() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz: "));
        int matriz[][] = new int[n][n];
        String salida = "Dimension de la matriz: " + n + "\n Matriz incial: \n";
        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                matriz[x][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese el valor para [" + (x + 1) + "][" + (j + 1) + "]"));
                if (j == n - 1)
                    salida += "[" + (matriz[x][j]) + "]" + "\n";
                else
                    salida += "[" + (matriz[x][j]) + "]";
            }
        }
        salida += "\n Matriz de 0 y 1 \n";
        Procesar Main = new Procesar();
        Main.procesar(matriz, salida, n);
    }
}