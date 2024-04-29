import javax.swing.JOptionPane;

public class Taller_16 {

    public String leer() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector: "));
        int[] vector = new int[n];
        String cad = "", dad = "", salida = "";
        for (int x = 0; x < n; x++) {
            vector[x] = Integer.parseInt(JOptionPane.showInputDialog("Vec[" + (x + 1) + "]"));
            if (x == n - 1)
                dad += vector[x];
            else
                dad += vector[x] + ",";
        }
        cad += procesar(vector, n, cad);
        salida += "Dimension del vector: " + n + "\nDatos desordenados: \n" + dad + "\n" + "Datos ordenados" + "\n"
                + cad;
        return salida;
    }

    public static String procesar(int vector[], int n, String cad) {
        for (int i = 0; i <= (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                if (vector[i] > vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
        for (int x = 0; x < n; x++) {
            if (x == n - 1)
                cad += vector[x];
            else
                cad += vector[x] + ",";
        }
        return cad;
    }

}