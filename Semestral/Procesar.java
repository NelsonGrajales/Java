public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int h = 1;
        for (int x = 0; x < n; x++) {
            for (int j = n - 1; j > -1; j--) {
                vec[x][j] = 0;
            }
        }
        for (int x = n - 1; x > 0; x--) {
            if (h == 1) {
                if (h < n) {
                    for (int j = 0; j < n; j++) {
                        vec[j][x] = h;
                        h++;
                    }
                } else if (h == n + 1) {
                    for (int j = n - 2; j > -1; j--) {
                        vec[x][j] = h;
                        h++;
                    }
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                salida += "[" + (vec[x][j]) + "]";
            }
            salida += "\n";
        }
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}