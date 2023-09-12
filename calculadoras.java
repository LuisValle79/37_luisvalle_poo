/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Luis
 */

public class calculadoras {
    int num1;
    int num2;
    int result;
    public void restar (int num1, int num2){
        result=num1-num2;
        System.out.println(result);
    }
     public void sumar (int num2){
        result=num1+num2;
         System.out.println(result);
    }
      public void multiplicar (int num2){
        result=num1*num2;
         System.out.println(result);
    }
       public void dividir (double result){
        result=num1/num2;
         System.out.println(result);
    }
     public void restar (String o){
         System.out.println("o");  
    }
    public int obtenerResultado() {
        return num1;
    }
   
}
