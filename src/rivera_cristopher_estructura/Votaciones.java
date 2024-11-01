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
public class Votaciones {
    
    public static void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int votantes, azul = 0, rojo = 0, negro = 0, amarillo = 0, nulos = 0, votos, max;
        String voto, ganador;
        
        System.out.print("Ingrese la cantidad de votantes que hay en el pais: ");
        votantes = entrada.nextInt();
        entrada.nextLine(); //Ser solicita el numero de votantes.
        
        for (int i = 1; i <= votantes; i++) {//El ciclo para ingresar los votos.
            System.out.print("Ingresa el voto " + i + " Azul, Rojo, Negro, Amarillo: ");
            voto = entrada.nextLine().toUpperCase();
            
            switch (voto) {//Cuenta los votos.
                case "AZUL":
                    azul++;
                    break;
                    
                case "ROJO":
                    rojo++;
                    break;
                    
                case "NEGRO":
                    negro++;
                    break;
                    
                case "AMARILLO":
                    amarillo++;
                    break;
                    
                default:
                    nulos++;//Si el voto no es valido se considera nulo.
                    break;
            }
        }
        
        votos = azul + rojo + negro + amarillo + nulos; //Se calculan la cantidad de votos validos.
        
        if (votos >= votantes * 0.6) {// Se verifica que los votos sean al menos el 60% del total de votos.
            ganador = "";
            max = Math.max(Math.max(azul, rojo), Math.max(negro, amarillo));
            
            if (max == azul) { //Con el numero de votos se determina al ganador.
                ganador = "Azul";
            } else if (max == rojo) {
                ganador = "Rojo";
            } else if (max == negro) {
                ganador = "Negro";
            } else if (max == amarillo) {
                ganador = "Amarillo";
            }
            
            System.out.println("La planilla ganadora es: " + ganador); //Imprime cual es la planilla ganadora.
        } else {
            System.out.println("Error en la votacion.");
        }
        
        System.out.println("Resumen de votos:"); //Imprime el resumen de los votos.
        System.out.println("Azul: " + azul);
        System.out.println("Rojo: " + rojo);
        System.out.println("Negro: " + negro);
        System.out.println("Amarillo: " + amarillo);
        System.out.println("Nulos: " + nulos);
    }
}
