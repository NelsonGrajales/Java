public class Procesar {
    public void procesar(int vec[][], String salida, int n) {
        int h = 1;
        for (int x = 0; x < n; x++) {
            for (int j = n - 1; j > -1; j--) {
                vec[x][j] = 0;
            }
        }
        for (int x = n - 1; x > -1; x--) {
            int mitad = n / 2;
            if (n % 2 != 0 && n >= 5) {
                vec[mitad][mitad] = n * n;
                vec[mitad - 1][mitad] = (n * n) - 1;
            }
            if (h == 1) {
                if (h < n) {
                    for (int j = 0; j < n; j++) {
                        vec[j][x] = h;
                        h++;
                    }
                    if (h > n) {
                        for (int j = n - 2; j > -1; j--) {
                            vec[x][j] = h;
                            h++;
                        }
                    }
                }
            } else if (x == 0) {
                int z = n - 3;
                for (int j = 0; j <= n - 2; j++) {
                    vec[x][j] = h;
                    h++;
                }
                for (int y = 1; y < n - 1; y++) {
                    vec[y][n - 2] = h;
                    h++;
                }
                while (z > 0) {
                    vec[n - 2][z] = h;
                    z--;
                    h++;
                }
                for (int y = mitad; y > 0; y--) {
                    vec[y][1] = h;
                    h++;
                }
            } else {
                vec[x][0] = h;
                h++;
            }

        }

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
        Imprimir Main = new Imprimir();
        Main.imprimir(salida);
    }
}