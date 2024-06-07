public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int matrizDos[][] = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                matrizDos[x][j] = (vec[x][j] % 2 == 0) ? 1 : 0;
                salida += "[" + (matrizDos[x][j]) + "]";
            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}