//programa que lea dos numeros (decimales), y un caracter (+,-,*,/),
// e imprima la operacion segun el caracter elegido (switch)

import java.util.Scanner;

public class Taller_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese la operación a realizar (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("La suma es: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("La resta es: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }
}
