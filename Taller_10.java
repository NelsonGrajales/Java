//programa que lea la cantidad de numeros (enteros), e imprima la suma de los numeros pares e impares

import java.util.Scanner;

public class Taller_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);

        scanner.close();
    }
}