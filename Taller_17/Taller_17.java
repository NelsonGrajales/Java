// programa que carga un vecto4r de n elementos, ingresar un nuevo elemento en
// la posicion (n+1) e impima el nuevo vector

import javax.swing.JOptionPane;

public class Taller_17 {
    public void leer() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector: "));
        int nuevoVal;
        int[] vector = new int[n];
        String cad = "", dad = "";
        for (int x = 0; x < n; x++) {
            vector[x] = Integer.parseInt(JOptionPane.showInputDialog("Vec[" + (x + 1) + "]"));
            if (x == n - 1)
                dad += vector[x];
            else
                dad += vector[x] + ",";
        }
        nuevoVal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector: "));
        procesar(vector, nuevoVal, n);
        imprimir(cad, dad);
    }

    public static String procesar(int vector[], int nuevoVal, int n) {
        int i = n + 1;
        String cad = "";
        int[] nuevoVec = new int[i];
        for (i = 0; i < n + 1; i++) {
            if (i != n) {
                nuevoVec[i] = vector[i];
                cad += nuevoVec[i] + ",";
            } else {
                nuevoVec[i] = nuevoVal;
                cad += nuevoVec[i];
            }
        }
        return cad;
    }

    public static void imprimir(String cad, String dad) {
        JOptionPane.showMessageDialog(null,
                "S A L I D A\n" + "Arreglo inicial\n" + dad + "\n" + "Arreglo con el nuevo elemento\n" + cad);
    }
}