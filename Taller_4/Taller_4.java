
// Programa que imprime una vocal (if-else)
import java.util.Scanner;

public class Taller_4 {
    public static void main(String[] args) {
        char voca;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        voca = sc.next().charAt(0);
        if (voca == 'A' || voca == 'a' || voca == 'E' ||
                voca == 'e' || voca == 'I' || voca == 'i' || voca == 'O' || voca == 'o' || voca == 'U' || voca == 'u') {
            System.out.println("La letra ingresada '" + voca + "' es una vocal.");
        } else {
            System.out.println("La letra ingresada '" + voca + "' no es una vocal.");
        }
        sc.close();
    }
}
