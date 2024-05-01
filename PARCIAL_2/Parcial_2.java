import javax.swing.JOptionPane;

public class Parcial_2 {
    public void leer() {
        int n, elemento, a = 0;
        int suma = 0;
        int mitad;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros (impar)"));
        } while (n % 2 == 0);
        mitad = n / 2;
        String salida = "Cantidad de numeros: " + n + "\n";
        for (int i = 0; i < n; i++) {
            elemento = Integer.parseInt(JOptionPane.showInputDialog("Num[" + i + "]"));
            if (i < n)
                salida += elemento + ",";
            else
                salida += elemento;
            a += procesar(elemento, i, mitad, suma);
        }
        salida += "\n" + "la suma de los 3 numeros del centro es : " + a;

        imprimir(salida);

    }

    public static int procesar(int elemento, int i, int mitad, int suma) {
        if (i == mitad || i == mitad + 1 || i == mitad - 1) {
            suma = elemento;
        }
        return suma;
    }

    public static void imprimir(String salida) {
        JOptionPane.showMessageDialog(null, "S A L I D A \n" + salida);
    }
}
