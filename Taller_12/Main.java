//Programa que lea dos numeros (enteros)
package Taller_12;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
        Taller_12 Main;
        Main = new Taller_12();
        Main.procesar(n1, n2);
    }
}