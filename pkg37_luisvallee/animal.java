
package pkg37_luisvallee;
import javax.swing.JOptionPane;

public class animal {

//atributo
    String nombre;
    int peso;
    String caracteristicas;
    
//metodo
    public void datalle() {
        System.out.println("el animal " + nombre + " es un carnivoro que "+ caracteristicas + " y su peso es "+ peso);
    }
    
    public void datalle2() {
        System.out.println("el animal " + nombre + " es un hervivoro que "+ caracteristicas +  " y su peso es "+ peso);
    }

    public void preguntar(){
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        peso = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el peso"));
        caracteristicas = JOptionPane.showInputDialog(null, "Ingrese las caracteristicas");
        
    }
}