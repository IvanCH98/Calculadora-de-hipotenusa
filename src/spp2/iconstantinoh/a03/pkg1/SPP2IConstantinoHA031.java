/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a03.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPP2IConstantinoHA031 {


     //* @param args the command line arguments
     //*/
    public static void main(String[] args) {
        System.out.println("Calculadora de Hipotenusa");
     //Paso 1.- Declaración de variables
     double co, ca, hip; //co= cateto opuesto, ca=cateto adyacente hip=hipotenusa
     Scanner teclado= new Scanner (System.in);
     
     //Paso 2.- Pedir los datos
        System.out.println("Introduce el valor del cateto adyacente: ");
        ca= teclado.nextDouble(); 
        System.out.println("Introduce el valor del cateto adyacente");   
        co= teclado.nextDouble();
        //Calcular el valor de la hipotenusa
        
       hip=Math.sqrt ((Math.pow(ca,2)) + (Math.pow(co,2)));
       //Mostramos el resultado
        System.out.println("La hipotenusa es: " +hip );
               
    }
    
}
