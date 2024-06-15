public class Procesar {
    public void procesar(int vec[][], String salida, int n) {

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                if (vec[x][j] < 10) {
                    salida += "[0" + (vec[x][j]) + "]";
                } else {
                    salida += "[" + (vec[x][j]) + "]";

                }
            }
            salida += "\n";
        }
        salida += "\nDiagonal\n";

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                if (x == j) {
                    salida += "**";
                } else {
                    if (vec[x][j] < 10) {
                        salida += "0" + (vec[x][j]) + " ";
                    } else {
                        salida += " " + (vec[x][j]) + "  ";
                    }
                }

            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}