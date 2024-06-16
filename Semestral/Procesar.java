public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int t = 0;
        int h = 1;
        int u = n - 1;
        while (t < n) {
            t = 0;
            for (int x = u; x < n; x++) {
                vec[t][x] = h;
                h++;
                t++;
            }
            u--;
        }
        u = n - 1;
        int r = 1;
        while (r <= n - 1) {
            t = r;
            for (int x = 0; x < u; x++) {
                vec[t][x] = h;
                h++;
                t++;
            }
            u--;
            r++;
        }

        for (int x = 0; x < n; x++) {
            for (int j = 0; j < n; j++) {
                if (vec[x][j] < 10) {
                    salida += "0" + (vec[x][j]) + " ";
                } else {
                    salida += "" + (vec[x][j]) + " ";

                }
            }
            salida += "\n";
        }

        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}