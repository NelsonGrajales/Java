import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Taller_15 taller = new Taller_15();
        int[] elementos = leer();
        int suma = taller.procesar(elementos);
        taller.imprimir(suma);
    }

    public static int[] leer() {
        int n;
        do {
            String input = JOptionPane.showInputDialog("Ingrese el número de elementos (debe ser impar):");
            n = Integer.parseInt(input);
        } while (n % 2 == 0);

        int[] elementos = new int[n];
        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":");
            elementos[i] = Integer.parseInt(input);
        }
        return elementos;
    }
}
