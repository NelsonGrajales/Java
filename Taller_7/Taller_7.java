//programa que lea una nota en numero (decimal), e imprima la nota en letra (if-else)

import java.util.Scanner;


class Taller_7 {
    public float nota;
    public String letra = "";
    
    Scanner sc = new Scanner(System.in);

    public void leer() {
        System.out.print("Ingrese una nota: ");
        nota = sc.nextFloat();
    }
    
    public void procesar() {
        if (nota < 0 || nota > 100) {
            letra = "I";
        } else if(nota > 0) {
            if(nota <= 60.4){
                letra = "F";
            }else if(nota >= 60.5 && nota <= 70.4){
                letra = "D";
            }else if (nota >= 70.5 && nota <= 80.4){
                letra = "C";
            }else if(nota >= 80.5 && nota <= 90.4){
                letra = "B";
            }else if(nota >= 90.5){
                letra = "A";
            }
        }
    }
    
    public void imprimir() {
        if(letra == "I"){
            System.out.print("Su nota no es valida");
        }else{
            System.out.print("Su nota es: " + letra);
        }
    }
    
    public static void main(String[] args) {
        Taller_7 programa = new Taller_7();
        programa.leer();
        programa.procesar();
        programa.imprimir();
    }
}
