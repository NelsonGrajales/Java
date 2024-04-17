//programa que lea n cantidad de numeros enteros e imprima el numero menor y mayor

import javax.swing.JOptionPane;

public class Taller_11 {
    public void leer() {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros"));
        procesar(n);
    }

    public void procesar(int n) {
        String cad = "";
        int men, may, num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Num[1]"));
        men = num;
        may = num;
        cad += num + "\n";
        for (int i = 2; i <= n; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Num[" + i + "]"));
            cad += num + "\n";
            if (num < men)
                men = num;
            else if (num > may)
                may = num;
        }
        imprimir(men, may, cad);
    }

    public void imprimir(int may, int men, String cad) {
        JOptionPane.showMessageDialog("S A L I D A\n", "Datos ingresados\n" + cad + "\n",
                "el numero mayor es : " + may + "\n", "el numero menor es " + men + "\n");
    }
}