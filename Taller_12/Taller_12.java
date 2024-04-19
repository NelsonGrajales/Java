package Taller_12;

import javax.swing.*;

public class Taller_12

{
    public void procesar(int n1, int n2) {
        String cad = "";
        int i;
        if (n1 < n2)
            for (i = n1 + 1; i < n2; i++)
                if (i + 1 == n2) {
                    cad += i;
                } else {
                    cad += i + " , ";
                }

        if (n1 > n2)
            for (i = n2 + 1; i < n2; i++)
                if (i + 1 == n1) {
                    cad += i;
                } else {
                    cad += i + " , ";
                }
        imprimir(n1, n2, cad);
    }

    public void imprimir(int n2, int n1, String cad) {
        JOptionPane.showMessageDialog(null,
                cad + "\n" + "S A L I D A\n" + "Datos ingresados\n" + n1 + " , " + n2 + "\n");
    }

}