//leer n cantidad de numeros leer un nuevo elemento luego una posciion y cambiar por el nuevo elemento

import javax.swing.JOptionPane;

public class Taller_18 {

    public  String leer() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector: "));
        int nuevoVal,pos;
        int[] vector = new int[n];
        String salida = "Dimension del vector: " + n + "\n";
        for (int x = 0; x < n; x++) {
            vector[x] = Integer.parseInt(JOptionPane.showInputDialog("Vec[" + (x + 1) + "]"));
            if (x == n - 1)
                salida += "vec[" + (x+1) + "] = " + vector[x];
            else
                salida += "vec[" + (x+1) + "] = " + vector[x] + "\n";
        }

        nuevoVal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuevo elemento: "));
        do {
            pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la poscion para el nuevo elemento (menor a " + (n+1)+"):"));
        } while (pos > n || pos < 0);

        salida += "\nNuevo elemento: " + nuevoVal + "\nPosicion Elemento: " + pos + "\n";

        procesar(vector, nuevoVal, pos);

        for (int x = 0; x < n; x++) {
            if (x == n - 1)
                salida += "vec[" + (x+1)+ "] = " + vector[x];
            else
            salida += "vec[" + (x+1) + "] = " + vector[x] + "\n";
        }

        return salida;
    }

    public void procesar(int vector[], int nuevoVal, int pos) {
        vector[pos-1] = nuevoVal;
    }
}

