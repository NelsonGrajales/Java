public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int h = n - 1;
        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                vec[x][j] = (j == h) ? vec[x][j] : 0;
                if (vec[x][j] == 0) {
                    salida += "[ ]";
                } else {
                    salida += "[" + (vec[x][j]) + "]";
                }
            }
            h = h - 1;
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}