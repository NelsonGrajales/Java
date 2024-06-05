public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int matrizDos[][] = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                if (vec[x][j] % 2 == 0) {
                    matrizDos[x][j] = 1;
                } else {
                    matrizDos[x][j] = 0;
                }
                if (j == n - 1)
                    salida += "[" + (matrizDos[x][j]) + "]" + "\n";
                else
                    salida += "[" + (matrizDos[x][j]) + "]";
            }
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}