// Programa que carga un vector de n elementos e imprima la suma de los
// elementos pares e impares

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la dimension del vector"));
        Taller_14 Main;
        Main = new Taller_14();
        JOptionPane.showInputDialog(null, Main.leer(n));
    }
}