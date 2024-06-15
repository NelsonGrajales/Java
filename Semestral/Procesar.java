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
        salida += "\nMatriz Caracol \n";

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                if (x == 0 || x == n - 1 || j == 0 || j == n - 1) {
                    if (vec[x][j] < 10) {
                        salida += "0" + (vec[x][j]) + " ";
                    } else {
                        salida += " " + (vec[x][j]) + "  ";

                    }
                } else {
                    salida += "      ";
                }

            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}