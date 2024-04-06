// Programa que lea n cantidad de numero, e imprima
// la suma de los numeros positivos y negativos

import java.util.Scanner;

public class Taller_6 {
    public int n, num, sune = 0, supo = 0;
    Scanner sc = new Scanner(System.in);

    public void leer() {
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();
    }

    public void procesar() {
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextInt();
            if (num > 0) {
                supo += num;
            } else {
                sune += num;
            }
        }
        System.out.println("La suma de los números positivos es: " + supo);
        System.out.println("La suma de los números negativos es: " + sune);
    }

    public static void main(String[] args) {
        Taller_6 programa = new Taller_6();
        programa.leer();
        programa.procesar();
    }
}
