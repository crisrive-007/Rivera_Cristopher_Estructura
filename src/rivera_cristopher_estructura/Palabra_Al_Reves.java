/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivera_cristopher_estructura;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Palabra_Al_Reves {
    
    public static void ejeciutar() {
        Scanner entrada = new Scanner(System.in);
        String palabra, alreves = ""; //Se inicializan las variables.
        
        System.out.print("Ingresa una palabra: ");
        palabra = entrada.nextLine();//SE le pide al usuario que ingrese una palabra.
        
        for (int i = palabra.length(); i > 0; i--) {
            alreves += palabra.substring(i - 1, i);// Se utiliza un ciclo para invertir la palabra usando subcadenas.
        }
        
        System.out.println("La palabra al reves: " + alreves);//Se imprime la palabra ya invertida.
    }
}
