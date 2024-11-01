/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivera_cristopher_estructura;

import java.util.Random;

/**
 *
 * @author river
 */
public class Numeros_Primos {
    
    public static void ejecutar(){
        Random random = new Random(); //Se genera un numero aleatorio entre 1 y 100
        int numero = random.nextInt(100) + 1, contador = 0;
        
        StringBuilder divisores = new StringBuilder();
        
        for (int i = 1; i <= numero; i++) {//Se verifica si el numero es primo.
            if(numero % i == 0) {
                contador++;//Se cuentan los divisores del numero.
                divisores.append(i).append(" ");
            }
        }
        
        boolean primo = (contador == 2);//Determina si el numero es primo.
        
        if (primo) {//Se imprimen los resultados.
            System.out.println("El numero " + numero + " es primo porque tiene " + contador + " divisores que son " + divisores);
        } else {
            System.out.println("El numero " + numero + " no es primo.");
        }
    }
}
