/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rivera_cristopher_estructura;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Rivera_Cristopher_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner eleccion = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        System.out.println("===== MENU DE EJERCICIOS =====");//Se muestra el menu de opciones.
        System.out.println("1. Palabras al reves.");
        System.out.println("2. Numero perfecto.");
        System.out.println("3. Numeros primos");
        System.out.println("4. Votaciones");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = eleccion.nextInt();
        
        switch (opcion) {//Determina la opcion que se selecciono.
            
            case 1:
                Palabra_Al_Reves.ejeciutar();
                break;
            
            case 2:
                Numero_Perfecto.ejecutar();
                break;
                
            case 3:
                Numeros_Primos.ejecutar();
                break;
                
            case 4:
                Votaciones.ejecutar();
                break;
                
            case 5:
                break;
        }
    }
    
}
