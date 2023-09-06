
package pkg37_luisvallee;

import javax.swing.JOptionPane;

public class auto {
//atributo
    String marca;
    String color;
    int kilometros;
    
//metodo
    public void acelerar() {
        System.out.println("el auto de color " + color + " aceleré");
    }
    
    public void frenar() {
        System.out.println("frena fercho! ");
    }

    public void sonido() {
        System.out.println("titiiiiiii! ");
    }
    
    public void preguntar(){
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca");
        color  = JOptionPane.showInputDialog(null, "Ingrese el color");
       kilometros = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el km"));
    }
}
