
package pkg37_luisvallee;

import java.util.Scanner;

public class persona {
    String nombre;
    int edad;
    
    //metodos
    public void hablar() {
        System.out.println(nombre + "Que fue mano!! gaaaaaaaaaaaa");
    }
    
    public void orden() {
        System.out.println(nombre + "levanto la mano");
    }
    
    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre (Persona): ");
        nombre = scanner.next();
        System.out.print("Ingrese una edad (Edad): ");
        edad = scanner.nextInt();
        scanner.close();
    }
    
}