
package pkg37_luisvallee;

import java.util.Scanner;

public class calculadora {
    
    int a;
    int b;
    int totalsuma;
    int totalresta;
    int totalmultiplicar;
    int totaldivision;
    
    public void sumar() {
        totalsuma = a + b;
        System.out.println(totalsuma);
    }
    
    public void restar() {
        totalresta = a - b;
        System.out.println(totalresta);
    }
    
    public void multiplicar() {
        totalmultiplicar = a * b;
        System.out.println(totalmultiplicar);
    }
            
    public void dividir() {
        if (b != 0) {
            totaldivision = a / b;
            System.out.println(totaldivision);
        } else {
            System.out.println("Error: imposible dividir por cero.");
        }
    }
    
    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer número: ");
        a = scanner.nextInt();
        System.out.print("ingrese el segundo número: ");
        b = scanner.nextInt();
        scanner.close();
    }
    
    public void mostrarValores() {
        System.out.println("La suma es: " + totalsuma);
        System.out.println("La resta es: " + totalresta);
        System.out.println("La multiplicación es: " + totalmultiplicar);
        System.out.println("La división es: " + totaldivision);
    }    

    public static void main(String[] args) {
        calculadora calculadora = new calculadora();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();
        calculadora.mostrarValores();
    }
}