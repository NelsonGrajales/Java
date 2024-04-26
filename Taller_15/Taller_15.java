import javax.swing.JOptionPane;

public class Taller_15 {
    public int procesar(int[] elementos) {
        int inicio = elementos[0];
        int medio = elementos[elementos.length / 2];
        int fin = elementos[elementos.length - 1];
        return inicio + medio + fin;
    }

    public void imprimir(int suma) {
        JOptionPane.showMessageDialog(null, "La suma del primer, medio y último elemento es: " + suma);
    }
}
