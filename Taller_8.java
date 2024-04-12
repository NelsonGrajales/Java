//programa que lea 3 numeros (entero), e imprima
// el numero meno, mediano y mayor (if-else)

import java.util.Scanner;


class Taller_8 {
    public int numUno, numDos, numTres, mayor, menor, mediano;
    Scanner sc = new Scanner(System.in);

    public void leer() {
        System.out.print("Ingrese el numero 1: ");
        numUno = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        numDos = sc.nextInt();
        System.out.print("Ingrese el numero 3: ");
        numTres = sc.nextInt();
    }
    
    public void procesar() {
        if(numUno > numDos && numUno > numTres && numDos > numTres){
           mayor = numUno;
           mediano = numDos;
           menor = numTres;
        }else if(numUno > numDos && numUno > numTres && numDos < numTres){
            mayor = numUno;
           mediano = numTres;
           menor = numDos;
        }else if (numDos > numUno && numDos > numTres && numUno > numTres){
            mayor = numDos;
           mediano = numUno;
           menor = numTres;
        }else if(numDos > numUno && numDos > numTres && numUno < numTres){
             mayor = numDos;
           mediano = numTres;
           menor = numUno;
        }else if (numTres > numUno && numTres > numDos && numUno > numDos){
            mayor = numTres;
           mediano = numUno;
           menor = numDos;
        }else if(numTres > numUno && numTres > numDos && numUno < numDos){
             mayor = numTres;
           mediano = numDos;
           menor = numUno;
        }
    }
    
    public void imprimir() {
        System.out.print("El menor es: " + menor + " el mediano es: " + mediano + " El mayor es: " + mayor);
    }
    
    public static void main(String[] args) {
        Taller_8 programa = new Taller_8();
        programa.leer();
        programa.procesar();
        programa.imprimir();
    }
}
