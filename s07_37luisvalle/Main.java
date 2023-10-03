/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_37luisvalle;

/**
 *
 * @author Lab20
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("  Calculadora 1  ");
        System.out.println("=================");
        System.out.println("");

        Calculadora objcalculadora = new Calculadora();
        objcalculadora.preguntar();
        System.out.println("");
        objcalculadora.suma();
        objcalculadora.resta();
        objcalculadora.multiplicar();
        objcalculadora.dividir();
        objcalculadora.responder();
    }
    
}
