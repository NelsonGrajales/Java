public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        for (int x = 0; x < n; x++) {
            for (int j = n - 1; j > -1; j--) {
                vec[x][j] = j;
                salida += "[" + (vec[x][j]) + "]";
            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}