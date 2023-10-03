/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s07v2_37;

/**
 *
 * @author Lab20
 */
public class persona1 {

    public void jugar(String nombre) {
        System.out.println("hola, me llamo " + nombre + "y me gusta jugar basquet");
    }

    public void pasear(String nombre, int edad, int dni) {
        System.out.println("hola, me llamo " + nombre + " y tengo " + edad + " años y mi dni es " + dni);
    }

    public void gatear(String nombre, int edad) {
        System.out.println("hola, me llamo " + nombre + " y tengo " + edad + " años");
    }

    public void jugar(int edad) {
        System.out.println("hola tengo " + edad + " años");
    }

    public int getEdad() {
        return 20;
    }
}
