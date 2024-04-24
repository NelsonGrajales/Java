import javax.swing.JOptionPane;

public class Taller_14 {
    public static String leer(int n) {
        int i;
        int Vec[] = new int[20];
        String cad = "S A L I D A\n Datos Ingresados\n Dimension: " + n + "\n";
        for (i = 0; i < n; i++) {
            Vec[i] = Integer.parseInt(JOptionPane.showInputDialog("vec[" + i + "]"));
            cad += Vec[i] + "\n";
        }
        cad += procesar(n, Vec);
        return cad;
    }

    public static String procesar(int n, int Vec[]) {
        String cad = "";
        int i, supa = 0, suim = 0;
        for (i = 0; i < n; i++) {
            if (Vec[i] % 2 == 0)
                supa += Vec[i];
            else
                suim += Vec[i];
        }
        cad += "\nla suma de los elementos pares es: " + supa + "\nLa suma de los impares es: " + suim;

        return cad;
    }
}