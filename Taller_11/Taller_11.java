package Taller_11;

import javax.swing.JOptionPane;

public class Taller_11 {
    public void leer() {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números"));
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

    public void imprimir(int men, int may, String cad) {
        JOptionPane.showMessageDialog(null, "S A L I D A\n" + "Datos ingresados\n" + cad + "\n" +
                "El número mayor es: " + may + "\n" +
                "El número menor es: " + men + "\n");
    }
}
