public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                vec[x][j] = (x == j) ? vec[x][j] : 0;
                if (vec[x][j] == 0) {
                    salida += "[ ]";
                } else {
                    salida += "[" + (vec[x][j]) + "]";
                }
            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}