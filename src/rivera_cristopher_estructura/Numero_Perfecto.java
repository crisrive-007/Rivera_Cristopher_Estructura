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
public class Numero_Perfecto {
    
    public static void ejecutar() {
        Scanner entrada = new Scanner(System.in);{
        int numero, divisores = 0;//Se inicializan las variables.
        
        System.out.print("Ingresa un numero: ");
        numero = entrada.nextInt(); //Se le pide al usuario que ingrese un numero.
        
        for (int i = 1; i < numero; i++) { //El ciclo busca los divisores del numero.
            if (numero % i == 0) {
                divisores += i;
            }
        }
        
        if (divisores == numero) { //Se verifica si la suma de los divisores es igual al numero que se ingreso.
            System.out.println("El numero " + numero + " es un numero perfecto.");
        } else {
            System.out.println("El numero " + numero + " no es un numero perfecto.");
        }
    }
    }
}
